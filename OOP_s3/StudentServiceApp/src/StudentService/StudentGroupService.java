package StudentService;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Сервис для групп студентов
 */
public class StudentGroupService {
    /** Список групп студентов */
    private List<StudentGroup> groups;

    /**
     * Конструктор класса бъявляет пустой список Групп студентов
     */
    public StudentGroupService(){
        this.groups = new ArrayList<>();
    }
    /** Метод для получения всех групп из списка */
    public List<StudentGroup> getAll(){
        return this.groups;
    }

    /**
     * Метод сортировки Групп студентов с использованием универсального класса сравнения пользователей
     * @param numberGroup номер группы
     * @return метод возвращает отсортированный список студентов из группы
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
