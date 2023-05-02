package StudentDomen;

import java.util.Comparator;
/** Класс Сравнение групп по номеру группы */
public class StudentGroupComparator implements Comparator<StudentGroup> {
    /** Переопределение метода сравнения данных для сравнения групп  по индивидуальному номеру*/

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return Integer.compare(o1.getIgroup(), o2.getIgroup());
    }
}
