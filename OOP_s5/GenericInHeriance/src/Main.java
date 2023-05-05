import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student<String, Integer> s1 = new Student<>(125, "Коркина", "Регина", "Владимировна", 22);
        System.out.println(s1);
        Student<String, Integer> s2 = new Student<>(125, "Докукина", "Александра", "Владимировна", 22);
        Student<String, Integer> s3 = new Student<>(125, "Онуфриев", "Олег", "Семенович", 23);

        List<Student<String, Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        StudentGroup<String,Integer> group = new StudentGroup<>(listStud);

        for (Student<String, Integer> stud : group){
            System.out.println(stud);
        }

        Collections.sort(group.getStudents());


    }
}