package StudentDomen;

import java.util.Iterator;
import java.util.List;
/** Класс Группа студентов */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    /** Список студентов */
    private List<Student> students;
    /** Номер группы студентов */
    private int igroup;

    /**
     * Конструктор класса Группа студентов
     * @param students Список студентов
     * @param igroup Номер группы
     */

    public StudentGroup(List<Student> students, int igroup) {
        this.students = students;
        this.igroup = igroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getIgroup() {
        return igroup;
    }

    public void setIgroup(int igroup) {
        this.igroup = igroup;
    }

    //    @Override
//    public Iterator<Student> iterator() {
//
//        return new StudentGroupIterator(students);
//    }

    /**
     * Это итератор, созданный при помощи анонимной функции
     * @return
     */
    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()){
                    return null;
                }
                return students.get(counter++);
            }
        };
    }
    /** Переопределение метода печати */
    @Override
    public String toString(){
        return "\nGroup №: " + igroup + ", " + students.size() + " students,"
                +  students.stream().toList();
    }
    /** Переопределение метода сортировки */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.getStudents().size()){
            return 0;
        }
        if (this.students.size() < o.getStudents().size()){
            return -1;
        }
        return 1;
    }
}
