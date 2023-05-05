package Model;

/**
 * Класс Студент, включающий интерфейс сортировки
 */
public class Student extends User implements Comparable<Student>{
    /** id студента */
    private int studentId;

    /**
     * Конструктор класса Student
     * @param studentId индивидуальный номер студента
     * @param surname Фамилия студента
     * @param name Имя студента
     * @param fatherName Отчество студента
     * @param age Возраст студента
     */
    public Student(int studentId, String surname, String name, String fatherName, int age) {
        super(surname, name, fatherName, age);
        this.studentId = studentId;
    }
    /** Получить уникальный номер студента */
    public int getStudentId() {
        return studentId;
    }
    /** Добавить уникальный номер студента */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    /** Переопределения метода печати */
    @Override
    public String toString(){
        return "\nStudent: " + studentId+ ", " + super.getSurname() + " " +
                super.getName() + " " + super.getFatherName() + ", " +
                super.getAge() + " лет";
    }
    /** Переопределение метода сортировки
     * для сортировки по возрасту, а затем по индивидуальному номеру студента */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()){
            if (this.studentId == o.studentId) {
                return 0;
            }
            if (this.studentId < o.studentId){
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()){
            return -1;
        }
        return 1;

    }
}
