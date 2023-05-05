
/**
 * Абстрактный (обобщенный) класс пользователя
 */
public class User<T,V> {
    /** Фамилия */
    private T surname;
    /** Имя */
    private T name;
    /** Отчество */
    private T fatherName;
    /** Возраст */
    private V age;

    /**
     * Конструктор класса User
     * @param surname Фамилия
     * @param name Имя
     * @param fatherName Отчество
     * @param age Возраст
     */
    public User(T surname, T name, T fatherName, V age) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
    }
    /** Получить Фамилию пользователя */
    public T getSurname() {
        return surname;
    }
    /** Добавить Фамилию пользователя */
    public void setSurname(T surname) {
        this.surname = surname;
    }
    /** Получить имя пользователя */
    public T getName() {
        return name;
    }
    /** Добавить имя пользователя */
    public void setName(T name) {
        this.name = name;
    }
    /** Получить отчество пользователя */
    public T getFatherName() {
        return fatherName;
    }
    /** Добавить отчество пользователя */
    public void setFatherName(T fatherName) {
        this.fatherName = fatherName;
    }
    /** Получить возраст пользователя */
    public V getAge() {
        return age;
    }
    /** Добавить возраст пользователя */
    public void setAge(V age) {
        this.age = age;
    }

    /** Переопределение метода печати */
    @Override
    public String toString(){
        return "Person: " + surname + " " +
                name + " " + fatherName + ", " +
                age + " лет";
    }
}
