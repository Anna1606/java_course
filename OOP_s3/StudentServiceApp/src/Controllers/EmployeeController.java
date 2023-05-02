package Controllers;

import StudentDomen.Employee;
import StudentDomen.User;
import StudentService.EmployeeService;
/** Класс, контролирующий работу класса Работник */
public class EmployeeController implements iUserController<Employee> {
    /** Создать переменную типа Сервис Работников */
    private final EmployeeService employeeService = new EmployeeService();
    /** Переопределение метода создания пользователя для класса Работник
     * Создать Работника*/
    @Override
    public void create(String surname, String name, String fatherName, int age) {
        employeeService.create(surname,name,fatherName,age);
    }

    /**
     * Метод для выплаты зарплаты работникам
     * @param person Работник
     *
     * Работа метода предусмотрена только для типов данных Работник
     */
    static public <T extends Employee> void paySalary(T person){
        System.out.println(((User)person).getSurname() + " зп 10000р ");
    }

    /**
     * Метод для вычисления среднего числа из коллекции чисел
     * @param num коллекция числовых данных
     * @return    возвращает среднее число
     */
    static public <T extends Number> double mean(T[] num){
        double sum = 0.0;
        for (int i = 0; i < num.length; i++){
            sum = sum + num[i].doubleValue();
        }
        sum = sum/num.length;
        return sum;
    }

}
