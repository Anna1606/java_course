package Controller;

import Model.Student;

import java.util.Collection;
import java.util.List;

/**
 * Интерфейс для классов с хранилищами данных
 */
public interface iGetModel {
    /**
     * Метод получения всего списка студентов
     * @return
     */
    public List<Student> getAllStudent();

    /**
     * Метод удаления студента по его уникальному номеру
     * @param studentId уникальный номер студента
     * @return вернет true, если студент удален
     */
    public boolean deleteStudent(int studentId);

}
