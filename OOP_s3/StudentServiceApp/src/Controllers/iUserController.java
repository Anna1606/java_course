package Controllers;

import StudentDomen.User;
/** Обобщенный интерфейс для работы с классом Пользователя и его наследниками */
public interface iUserController<T extends User> {
    /**
     * Метод для создания пользователя
     * @param surname    Фамилия
     * @param name       Имя
     * @param fatherName Отчество
     * @param age        Возраст
     */
    void create(String surname, String name, String fatherName, int age);
}
