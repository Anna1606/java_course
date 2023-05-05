import Controller.Controller;
import Model.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import Model.Student;
import Model.FileRepo;
import Model.ModelHashMap;
import View.View;
import View.ViewEng;
import Controller.iGetModel;
import Controller.iGetView;


public class Main {
    public static void main(String[] args) {
        // Объявляем пустой список студентов
        List<Student> students = new ArrayList<>();

        // Создаем студентов
        Student s1 = new Student(234, "Сидорова", "Анна", "Александровна", 21);
        Student s2 = new Student(962, "Куприн", "Александр", "Иванович", 30);
        Student s3 = new Student(148, "Толстой", "Лев", "Николаевич", 25);
        Student s4 = new Student(369, "Пушкин", "Александр", "Сергеевич", 22);
        Student s5 = new Student(105, "Лермонтов", "Михаил", "Юрьевич", 22);
        Student s6 = new Student(789, "Есенин", "Сергей", "Александрович", 21);

        // Добавляем студентов в список студентов
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        // Создаем хранилище данных типа Файл
        FileRepo fileRepo = new FileRepo("StudentDb.txt");

        // Заполняем файл студентами из списка и сохраняем
//        for (Student pers : students){
//            fileRepo.addStudent(pers);
//        }
//        fileRepo.saveAllStudentsToFile();

        // Объявляем тип хранения данных ключ + значение (словарь)
        HashMap <Long, Student> studentHashMap = new HashMap<Long, Student>();
        // заполняем присваеваем каждому студенту ключ и добавляем в словарь
        for (long count = 1; count < students.size(); count++) {
            for (Student pers : students) {
                studentHashMap.putIfAbsent(count, pers);
            }
        }

        // Объявляем переменные типа интерфейса model с разными вариантами хранения данных
        iGetModel model = new Model(students);
        iGetModel modelFileRepo = fileRepo;
        iGetModel modelHashMap = new ModelHashMap(studentHashMap);


        // Объявляем интерфейсы для разных языков
        iGetView view = new View();
        iGetView viewEng = new ViewEng();

        // Создаем список хранилищ данных
        List<iGetModel> listModels = new ArrayList<>(Arrays.asList(model,fileRepo,modelHashMap));

        // Инициализируем контроллер
        Controller controller = new Controller(listModels);
        // Запускаем работу приложения, через контроллер
        controller.run();

        // Обновить отображение данных
//        controller.updateView();
    }

}