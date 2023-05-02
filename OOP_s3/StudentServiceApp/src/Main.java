import Controllers.EmployeeController;
import StudentDomen.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем Студентов
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
        // Группируем студентов в списки
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
        // Создаем группы студентов
        StudentGroup group1 = new StudentGroup(listStud1, 3301);
        StudentGroup group2 = new StudentGroup(listStud2, 4237);
        StudentGroup group3 = new StudentGroup(listStud3, 2597);
        StudentGroup group4 = new StudentGroup(listStud4, 5786);
        // Выводим на консоль студентов поочередно из группы 1
//        for (Student student : group1){
//            System.out.println(student);
//        }
//
//        System.out.println("==============после сортировки====================");
          // Сортируем студентов из группы 1 по возрасту и индивидуальному номеру
//        Collections.sort(group1.getStudents());
//        // Выводим на консоль студентов поочередно после сортировки
//        for (Student student : group1){
//            System.out.println(student);
//        }


        // Создаем список групп студентов
        List<StudentGroup> list = new ArrayList<>(Arrays.asList(group1, group2, group3, group4));
        // Создаем поток групп студентов
        StudentSteam course = new StudentSteam(list, 100);
//        System.out.println("============== Вывод групп в потоке ================");
          // Вывод на консоль студентов каждой группы в потоке поочередно
//        for (StudentGroup ngroup: course){
//            System.out.println(ngroup);
//        }
//        // Сортируем поток групп по количеству студентов
//        Collections.sort(course.getCourse());
//        System.out.println("============== после сортировки по кол-ву студентов ====================");
//        System.out.println(course);
          // Сортируем по индивидуальному номеру группы
//        course.getCourse().sort(new StudentGroupComparator());
//        System.out.println("============== после сортировки по id группы ====================");
//        System.out.println(course);

          // Создаем работника
//        Employee person1 = new Employee("Иванов", "Иван", "Иванович", 55, 110);
          // Выплачиваем зарплату работнику
//        EmployeeController.paySalary(person1);

          // Создаем список часов посещения условного студента
//        Integer studHour[] = {124, 234, 231,  1, 45};
          // Выводим на консоль среднее количество часов из списка выше
//        System.out.println(EmployeeController.mean(studHour));

          // Создаем списко зарплат работников
//        Double empSalary[] = {12555.23, 34213.5, 10000.0};
          // Выводим среднюю зарплату работников из списка выше
//        System.out.println(EmployeeController.mean(empSalary));

        //Считаем средний возраст студентов из списка
        AverageAge.getMidleAge(listStud1);
        AverageAge.getMidleAge(listStud2);
    }
}