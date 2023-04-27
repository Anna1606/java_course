package StudentDomen;

public class User {
    private String surname;
    private String name;
    private String fatherName;
    private int age;

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
    @Override
    public String toString(){
        return "Person: " + surname + " " +
                name + " " + fatherName + ", " +
                age + " лет";
    }
}
