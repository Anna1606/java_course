package Model;

/**
 * Абстрактный (обобщенный) класс пользователя
 */
public class User {
    /** Фамилия */
    private String surname;
    /** Имя */
    private String name;
    /** Отчество */
    private String fatherName;
    /** Возраст */
    private int age;

    /**
     * Конструктор класса User
     * @param surname Фамилия
     * @param name Имя
     * @param fatherName Отчество
     * @param age Возраст
     */
    public User(String surname, String name, String fatherName, int age) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
    }
    /** Получить Фамилию пользователя */
    public String getSurname() {
        return surname;
    }
    /** Добавить Фамилию пользователя */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /** Получить имя пользователя */
    public String getName() {
        return name;
    }
    /** Добавить имя пользователя */
    public void setName(String name) {
        this.name = name;
    }
    /** Получить отчество пользователя */
    public String getFatherName() {
        return fatherName;
    }
    /** Добавить отчество пользователя */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    /** Получить возраст пользователя */
    public int getAge() {
        return age;
    }
    /** Добавить возраст пользователя */
    public void setAge(int age) {
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
