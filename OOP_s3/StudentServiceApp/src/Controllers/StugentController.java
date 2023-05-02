package Controllers;

import StudentDomen.Student;
import StudentService.StudentService;
import StudentService.StudentGroupService;
/** Класс для управления типом пользователей Студент*/
public class StugentController implements iUserController<Student> {
    /** Объявляем переменную типа Сервис Студента*/
    private final StudentService dataService = new StudentService();
    /** Объявляем переменную типа Сервис для групп студентов */
    private final StudentGroupService groupService = new StudentGroupService();

    /**
     * Конструктор создания пользователей
     * @param surname    Фамилия
     * @param name       Имя
     * @param fatherName Отчество
     * @param age        Возраст
     */
    @Override
    public void create(String surname, String name, String fatherName, int age) {
        dataService.create(surname, name, fatherName, age);
    }
}
