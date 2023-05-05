package Model;

import Controller.iGetModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ModelHashMap implements iGetModel {
    private HashMap<Long, Student> students;

    public ModelHashMap(HashMap<Long, Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent(){

        return students.values().stream().toList();
    }

    @Override
    public boolean deleteStudent(int studentId) {
        boolean find = true;
        for (var pers : students.entrySet()) {
            if (pers.getValue().getStudentId() == studentId) {
                students.remove(pers);
                find = true;
            } else {
                find = false;
            }
        }
        return true;
    }
}
