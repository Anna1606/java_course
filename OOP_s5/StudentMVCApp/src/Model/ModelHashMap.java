package Model;

import Controller.iGetModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Класс хранилища данных типа ключ + значение (словарь)
 */
public class ModelHashMap implements iGetModel {
    /**
     * Список студентов типа ключ + студент
     */
    private HashMap<Long, Student> students;

    /**
     * Конструктор класса хранилища данных типа ключ + значение
     * @param students список студентов с ключом
     */

    public ModelHashMap(HashMap<Long, Student> students) {
        this.students = students;
    }

    /**
     * Метод получения всего списка студентов
     * @return
     */
    public List<Student> getAllStudent(){
        return students.values().stream().toList();
    }

    /**
     * Метод удаления студента по его уникальному номеру
     * @param studentId уникальный номер студента
     * @return
     */
    @Override
    public boolean deleteStudent(int studentId) {
        boolean find = true;
        for (var pers : students.entrySet()) {
            if (pers.getValue().getStudentId() == studentId) {
                students.remove(pers);
                find = true;
            } else {
                find = false;
            }
        }
        return true;
    }
}
