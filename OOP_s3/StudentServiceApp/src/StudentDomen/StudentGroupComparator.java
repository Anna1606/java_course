package StudentDomen;

import java.util.Comparator;
/** Класс Сравнение групп по номеру группы */
public class StudentGroupComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return Integer.compare(o1.getIgroup(), o2.getIgroup());
    }
}
