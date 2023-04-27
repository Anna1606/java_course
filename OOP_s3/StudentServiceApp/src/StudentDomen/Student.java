package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private int studentId;
    public Student(int studentId, String surname, String name, String fatherName, int age) {
        super(surname, name, fatherName, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString(){
        return "\nStudent: " + studentId+ ", " + super.getSurname() + " " +
                super.getName() + " " + super.getFatherName() + ", " +
                super.getAge() + " лет";
    }

    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()){
            if (this.studentId == o.studentId) {
                return 0;
            }
            if (this.studentId < o.studentId){
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()){
            return -1;
        }
        return 1;

    }
}
