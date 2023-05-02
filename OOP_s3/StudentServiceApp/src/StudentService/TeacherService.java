package StudentService;

import StudentDomen.Employee;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Сервис Учителя, включающий обобщенный интерфейс пользователя
 */
public class TeacherService implements iUserService<Teacher> {
    /** Сквозной номер учителя */
    private int count;
    /** Список учителей */
    private List<Teacher> teachers;
    /**
    * Конструктор класса объявляет пустой список учителей
     * для дальнейшего заполнения
     * */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    /** Получить всех учителей из списка */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    /** Создать Учителя и добавить в список */
    @Override
    public void create(String surname, String name, String fatherName, int age) {
        Teacher per = new Teacher(count,"", surname, name, fatherName, age, "");
        count++;
        teachers.add(per);
    }
    /** Отсортировать список учителей по Фамилии и Имени
     * с использованием универсальной сортировки пользователей */
    public List<Teacher> getSortedByFIOTeachers(int numberGroup){
        List<Teacher> teacherList = new ArrayList<>(teachers);
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
}
