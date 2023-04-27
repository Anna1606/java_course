package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> course;
    private int numOfSteam;

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
    @Override
    public String toString(){
        return "\nCourse №:" + numOfSteam + ", groups: " + course.size()
                + " " + course.stream().toList();
    }
}

