package Controller;

import Model.Student;

import java.util.Collection;
import java.util.List;

public interface iGetModel {
    public List<Student> getAllStudent();
    public boolean deleteStudent(int studentId);

}
