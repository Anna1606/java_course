package StudentDomen;
/**
 * Класс Учитель (подкласс User)
 */
public class Teacher extends User{
    /** Предмет учителя */
    private String lesson;
    /** Уникальный номер учителя */
    private int teacherId;
    /** Ученая степень */
    private String academicDegree;

    /**
     * Конструктор класса Учитель
     * @param teacherId      Уникальный номер
     * @param lesson         Дисциплина преподавателя
     * @param surname        Фамилия учителя
     * @param name           Имя учителя
     * @param fatherName     Отчество учителя
     * @param age            Возраст учителя
     * @param academicDegree Ученая степень
     */

    public Teacher(int teacherId, String lesson, String surname,
                   String name, String fatherName, int age, String academicDegree) {
        super(surname, name, fatherName, age);
        this.lesson = lesson;
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }
    /** Получить дисциплину */
    public String getLesson() {
        return lesson;
    }
    /** Добавить дисциплину */
    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    /** Получить уникальный номер учителя */
    public int getTeacherId() {
        return teacherId;
    }
    /** Добавить уникальный номер учителя */
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    /** Получить присвоенную ученую степень */
    public String getAcademicDegree() {
        return academicDegree;
    }
    /** Добавить ученую степень */
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /** Переопределие метода печати для класса Учитель */
    @Override
    public String toString() {
        return "Teacher: "+ teacherId + lesson + ", " + super.getSurname() + " " +
                super.getName() + " " + super.getFatherName() + ", " + academicDegree + ", "
                + super.getAge() + " лет";
    }
}
