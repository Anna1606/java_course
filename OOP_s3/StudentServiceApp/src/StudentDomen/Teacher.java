package StudentDomen;
/**
 * Класс Учителя
 */
public class Teacher extends User{
    /** Предмет учителя */
    private String lesson;

    /**
     * Конструктор класса Учитель
     * @param lesson Предмет
     * @param surname Фамилия учителя
     * @param name Имя учителя
     * @param fatherName Отчество учителя
     * @param age Возраст учителя
     */

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
    /** Переопределие метода печати */
    @Override
    public String toString() {
        return "Teacher: " + lesson + ", " + super.getSurname() + " " +
                super.getName() + " " + super.getFatherName() + ", " +
                super.getAge() + " лет";
    }
}
