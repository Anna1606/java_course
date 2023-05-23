import java.util.Date;
/** Класс работник */
public class Employee {
    /** Имя работника */
    private String name;
    /** Дата */
    private Date dob;
    /** Базовый оклад */
    private int baseSalary;

    /**
     * Конструктор класса Работник
     * @param name имя Работника
     * @param dob дата
     * @param baseSalary базовый оклад
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    /** Получить информацию о базовом окладе сотрудника */
    public int getBaseSalary() {
        return baseSalary;
    }
    /** Получить информацию о сотруднике */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
