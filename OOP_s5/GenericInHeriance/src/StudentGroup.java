

import java.util.Iterator;
import java.util.List;
/** Класс Группа студентов, включающий переопределение методов перебора и сортировки списка студентов*/
public class StudentGroup<T,V extends Comparable<V>> implements Iterable<Student<T,V>>{
    /** Список студентов */
    private List<Student<T,V>> students;
    /**
     * Конструктор класса Группа студентов
     * @param students Список студентов
     */

    public StudentGroup(List<Student<T,V>> students) {
        this.students = students;
    }

    /**
     * Метод для получения списка студентов группы
     */
    public List<Student<T,V>> getStudents() {
        return students;
    }
    /** Метод для добавления списка студентов */
    public void setStudents(List<Student<T,V>> students) {
        this.students = students;
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
    public Iterator<Student<T,V>> iterator() {

        return new Iterator<Student<T,V>>() {
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
        return "\nGroup №: " + ", " + students.size() + " students,"
                +  students.stream().toList();
    }

}
