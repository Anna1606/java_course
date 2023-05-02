package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератор студентов в группе
 */
public class StudentGroupIterator implements Iterator<Student> {
    /**
     * Счетчик списка студентов
     */
    private int counter;
    /**
     * Список студентов
     */
    private final List<Student> students;

    /**
     * Конструктор итератора студентов
     * @param students список студентов
     */

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Проверка на конец списка
     * @return если есть следующий студент в списке, продолжать идти по списку
     */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /**
     * Вернуть студента из списка по порядку, до тех пор, пока не кончится список
     * @return
     */
    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        };
        return students.get(counter++);
    }
}
