package StudentService;

import StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;
/**
* Класс Сервис Студента, включающий обобщенный интерфейс пользователя
 */
public class StudentService implements iUserService<Student> {
    /** Сквозной номер студента */
    private int count;
    /** Список студентов */
    private List<Student> students;

    /**
     * Конструктор класса объявляет пустой список студентов
     * для дальнейшего заполнения
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     * Метод для получения списка всех студентов списка
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * Метод создания Студента
     * Метод добавляет Студента в список
     * @param surname    Фамилия
     * @param name       Имя
     * @param fatherName Отчество
     * @param age        Возраст
     */
    @Override
    public void create(String surname, String name, String fatherName, int age) {
       Student per = new Student(count, surname, name, fatherName, age);
       count++;
       students.add(per);
    }

}
