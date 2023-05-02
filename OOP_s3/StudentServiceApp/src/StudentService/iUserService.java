package StudentService;

import java.util.List;
/** Обобщенный интерфейс пользовательского сервиса */
public interface iUserService<T> {
    /** Метод для получения списка пользователей любого типа */
    List<T> getAll();

    /**
     * Метод для создания пользователя
     * @param surname    Фамилия
     * @param name       Имя
     * @param fatherName Отчество
     * @param age        Возраст
     */
    void create(String surname, String name, String fatherName, int age);

}
