package Controller;

import Model.Student;

import java.util.List;

/**
 * Интерфейс Вывести на экран данные
 */
public interface iGetView {
    /**
     * Метод печати списка всех студентов из хранилища данных
     * @param students Список студентов
     */
    void printAllStudent(List<Student> students);

    /**
     * Метод считывания данных с консоли
     * @param message Сообщение пользователю
     * @return Вернуть введенные данные с консоли
     */
    String prompt(String message);
}
