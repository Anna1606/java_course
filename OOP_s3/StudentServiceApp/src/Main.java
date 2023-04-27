import StudentDomen.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Иванов", "Сергей", "Александрович", 25);
        Student s1 = new Student(234, "Сидорова", "Анна", "Александровна", 21);
        Student s2 = new Student(962, "Куприн", "Александр", "Иванович", 30);
        Student s3 = new Student(148, "Толстой", "Лев", "Николаевич", 25);
        Student s4 = new Student(369, "Пушкин", "Александр", "Сергеевич", 22);
        Student s5 = new Student(105, "Лермонтов", "Михаил", "Юрьевич", 22);
        Student s6 = new Student(789, "Есенин", "Сергей", "Александрович", 21);
        Student s7 = new Student(569, "Анисимов", "Михаил", "Антонович", 23);
        Student s8 = new Student(481, "Гришина", "Марина", "Юрьевна", 22);
        Student s9 = new Student(359, "Зайцева", "Антонина", "Михайловна", 21);
        Student s10 = new Student(435, "Онуфриев", "Олег", "Иванович", 22);
        Student s11 = new Student(233, "Грачева", "Анна", "Львовна", 25);
        Student s12 = new Student(491, "Духовский", "Дмитрий","Анатольевич", 23 );
        Student s13 = new Student(559, "Крюкова", "Наталья", "Андреевна", 22);
        Student s14 = new Student(116, "Маркович", "Алиса", "Сергеевна", 22);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s12);
        listStud1.add(s9);
        listStud1.add(s14);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s10);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s3);
        listStud3.add(s4);
        listStud3.add(s5);
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s11);
        listStud4.add(s13);

        StudentGroup group1 = new StudentGroup(listStud1, 3301);
//        for (Student student : group1){
//            System.out.println(student);
//        }
//
//        System.out.println("==============после сортировки====================");
//        Collections.sort(group1.getStudents());
//
//        for (Student student : group1){
//            System.out.println(student);
//        }

        StudentGroup group2 = new StudentGroup(listStud2, 4237);
        StudentGroup group3 = new StudentGroup(listStud3, 2597);
        StudentGroup group4 = new StudentGroup(listStud4, 5786);

        List<StudentGroup> list = new ArrayList<>(Arrays.asList(group1, group2, group3, group4));

        StudentSteam course = new StudentSteam(list, 100);
        System.out.println("============== Вывод групп в потоке ================");
        for (StudentGroup ngroup: course){
            System.out.println(ngroup);
        }

        Collections.sort(course.getCourse());
        System.out.println("============== после сортировки по кол-ву студентов ====================");
        System.out.println(course);
        course.getCourse().sort(new StudentGroupComparator());
        System.out.println("============== после сортировки по id группы ====================");
        System.out.println(course);

    }
}