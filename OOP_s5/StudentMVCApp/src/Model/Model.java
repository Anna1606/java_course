package Model;

import Controller.iGetModel;

import java.util.List;

/**
 * Класс хранилища данных типа Список
 */
public class Model implements iGetModel {
    /** Список студентов */
    private List<Student> students;

    /**
     * Конструктор класса данных типа Список
     * @param students список студентов
     */

    public Model(List<Student> students) {
        this.students = students;
    }

    /**
     * Метод получения всех студентов из списка
     * @return
     */
    public List<Student> getAllStudent(){
        return students;
    }

    /**
     * Метод удаления студента по уникальному номеру
     * @param studentId уникальный номер студента
     */
    @Override
    public boolean deleteStudent(int studentId) {
        boolean find = true;
        for (Student pers : students){
            if (pers.getStudentId() == studentId){
                students.remove(pers);
                find = true;
            } else {
                find = false;
            }
        }
        return find;
    }

}
