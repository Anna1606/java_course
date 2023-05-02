package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;
/** Класс, контролирующий работу класса Учитель */
public class TeacherController implements iUserController<Teacher> {
    /** Создаем переменную класса сервис Учителя */
    private final TeacherService teacherService = new TeacherService();
    /** Переопределение метода создания пользователя для класса Учитель
     * Создать Учителя */
    @Override
    public void create(String surname, String name, String fatherName, int age) {
        teacherService.create(surname, name, fatherName, age);
    }
}
