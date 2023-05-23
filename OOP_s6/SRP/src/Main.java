
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создаем работника
        Employee employee = new Employee("Andrey", new Date(), 20000);

        // Запускаем работу расчетчика зарплаты
        CalculateNetSalary netSalary = new CalculateNetSalary();

        // выводим информацию о работнике и положенной ему зарплате за вычетом налога
        System.out.printf("Employee " + employee.getEmpInfo() + " - " + netSalary.CalculateNetSalary(employee));
    }
}