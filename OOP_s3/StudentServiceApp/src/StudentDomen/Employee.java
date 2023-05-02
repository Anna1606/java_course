package StudentDomen;
/** Класс Работник наследик класса Пользователь */
public class Employee extends User {
    /** Уникальный номер работника */
    private int empId;

    /**
     * Конструктор класса Работник
     *
     * @param surname    Фамилия
     * @param name       Имя
     * @param fatherName Отчество
     * @param age        Возраст
     * @param empId      Уникальный номер работника
     */
    public Employee(String surname, String name, String fatherName, int age, int empId) {
        super(surname, name, fatherName, age);
        this.empId = empId;
    }
    /** Получить уникальный номер работника */
    public int getEmpId() {
        return empId;
    }
    /** Добавить уникальный номер работника */
    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
