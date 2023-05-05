package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс Отображения данных на русском языке
 */
public class View implements iGetView {
    /**
     * Метод печати всех студентов из списка
     * @param students Список студентов
     */
    public void printAllStudent(List<Student> students){
        System.out.println("------Вывод списка студентов-------");
        for (Student stud : students){
            System.out.println(stud);
        }
        System.out.println("------Конец списка-------");
    }

    /**
     * Метод считывания данных с консоли
     * @param message Сообщение пользователю
     * @return вернуть введенные данные с консоли
     */
    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

}
