package StudentDomen;

import java.util.Iterator;
import java.util.List;
/** Класс Поток студентов */
public class StudentSteam implements Iterable<StudentGroup>{
    /** Список групп студентов */
    private List<StudentGroup> course;
    /** Номер потока */
    private int numOfSteam;

    /**
     * Конструктор класса Поток студентов
     * @param course Список групп
     * @param numOfSteam Номер потока
     */
    public StudentSteam(List<StudentGroup> course, int numOfSteam) {
        this.course = course;
        this.numOfSteam = numOfSteam;
    }

    public List<StudentGroup> getCourse() {
        return course;
    }

    public void setCourse(List<StudentGroup> course) {
        this.course = course;
    }

    public int getNumOfSteam() {
        return numOfSteam;
    }

    public void setNumOfSteam(int numOfSteam) {
        this.numOfSteam = numOfSteam;
    }
    /** Итератор групп потока */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < course.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return course.get(counter++);
            }

        };
    }
    /** Переопределение метода печати */
    @Override
    public String toString(){
        return "\nCourse №:" + numOfSteam + ", groups: " + course.size()
                + " " + course.stream().toList();
    }
}

