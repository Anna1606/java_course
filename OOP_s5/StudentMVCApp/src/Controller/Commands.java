package Controller;

/**
 * Список возможных комманд для работы со списком студентов
 */
public enum Commands {
    // пусто
    NONE,
    // чтение данных
    READ,
    // создать
    CREATE,
    // обновить
    UPDATE,
    // получить список
    LIST,
    // удалить
    DELETE,
    // выйти из программы
    EXIT
}
