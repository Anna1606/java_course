package StudentDomen;

public class Teacher extends User{
    private String lesson;

    public Teacher(String lesson, String surname, String name, String fatherName, int age) {
        super(surname, name, fatherName, age);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    @Override
    public String toString() {
        return "Teacher: " + lesson + ", " + super.getSurname() + " " +
                super.getName() + " " + super.getFatherName() + ", " +
                super.getAge() + " лет";
    }
}
