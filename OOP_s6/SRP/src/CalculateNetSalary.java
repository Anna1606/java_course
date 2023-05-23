/**
 * Калькулятор расчета зарплаты за вычетом налога
 */
public class CalculateNetSalary {
    /**
     * Калькулятор зарплаты
     * @param employee Работник
     * @return
     */
    public int CalculateNetSalary(Employee employee) {
        // налог от базовой ставки работника
        int tax = (int) (employee.getBaseSalary() * 0.25);
        // метод возвращает разность базовой ставки оклада и налога
        return employee.getBaseSalary() - tax;
    }
}
