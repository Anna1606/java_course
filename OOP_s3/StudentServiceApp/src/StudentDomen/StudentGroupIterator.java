package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератор студентов в группе
 */
public class StudentGroupIterator implements Iterator<Student> {
    /**
     * Счетчик
     */
    private int counter;
    /**
     * Список студентов
     */
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Проверка на конец списка
     * @return true, если есть следующий студент в списке
     */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        };
        return students.get(counter++);
    }
}
