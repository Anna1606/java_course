package StudentDomen;

import java.util.Iterator;
import java.util.List;
/** Класс Группа студентов, включающий переопределение методов перебора и сортировки списка студентов*/
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

    /**
     * Метод для получения списка студентов группы
     */
    public List<Student> getStudents() {
        return students;
    }
    /** Метод для добавления списка студентов */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    /** Получить индивидуальный номер группы */
    public int getIgroup() {
        return igroup;
    }
    /** Добавить индивидуальный номер группы */
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
     * для поочередного перебора студентов, входящих в группу
     * @return
     */
    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            /**
             * Счетчик студентов в списке
             */
            private int counter;
            /** Проверка на наличие следующего студента в списке */

            @Override
            public boolean hasNext() {
                return counter < students.size();
            }
            /** Если есть в списке следующий студент, то переходим к нему */
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
    /** Переопределение метода сортировки групп по числу студентов в группе*/
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
