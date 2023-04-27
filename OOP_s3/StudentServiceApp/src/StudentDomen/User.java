package StudentDomen;

/**
 * Абстрактный класс пользователя
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

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /** Переопределение метода toString */
    @Override
    public String toString(){
        return "Person: " + surname + " " +
                name + " " + fatherName + ", " +
                age + " лет";
    }
}
