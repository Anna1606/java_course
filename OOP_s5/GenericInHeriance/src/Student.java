

/**
 * Класс Студент, включающий интерфейс сортировки
 */
public class Student<T,V extends Comparable<V>> extends User<T,V> implements Comparable<Student<T,V>>{
    /** id студента */
    private V studentId;

    /**
     * Конструктор класса Student
     * @param studentId индивидуальный номер студента
     * @param surname Фамилия студента
     * @param name Имя студента
     * @param fatherName Отчество студента
     * @param age Возраст студента
     */
    public Student(V studentId, T surname, T name, T fatherName, V age) {
        super(surname, name, fatherName, age);
        this.studentId = studentId;
    }
    /** Получить уникальный номер студента */
    public V getStudentId() {
        return studentId;
    }
    /** Добавить уникальный номер студента */
    public void setStudentId(V studentId) {
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
    public int compareTo(Student<T,V> o) {
        return this.studentId.compareTo(o.studentId);


    }
}
