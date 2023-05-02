package StudentService;

import StudentDomen.Employee;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Сервис Работника, включающий обобщенный интерфейс пользователя
 */
public class EmployeeService implements  iUserService<Employee>{
    /** Сквозной счетчик работников для того,
     * чтобы индивидуальный номер работника не повторялся
     */
    private int count;
    /** Список работников */
    private List<Employee> employees;

    /**
     * Конструктор класса, объявляет пустой список Работников для записи
     */
    public EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }
    /** Переопределение метода получения пользователей, что извлечения списка Работников */
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    /** Метод создания Работника
     * Метод добавляет Работника в список Работников
     * @param surname    Фамилия
     * @param name       Имя
     * @param fatherName Отчество
     * @param age        Возраст
     */
    @Override
    public void create(String surname, String name, String fatherName, int age) {
        Employee per = new Employee(surname, name, fatherName, age, count);
        count++;
        employees.add(per);
    }

    /**
     * Метод сортировки Работников с использованием универсального класса сравнения пользователей
     * @param numberGroup номер группы для сортировки
     * @return метод возвращает отсортированный список
     */
    public List<Employee> getSortedByFIOEmployees(int numberGroup){
        List<Employee> emps = new ArrayList<>(employees);
        emps.sort(new UserComparator<Employee>());
        return emps;
    }

}
