package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс Отображения данных на английском языке
 */
public class ViewEng implements iGetView {
    /**
     * Метод печати всех студентов из списка
     * @param students Список студентов
     */
    public void printAllStudent(List<Student> students){
        System.out.println("------Display the list of students on the screen-------");
        for (Student stud : students){
            System.out.println(stud);
        }
        System.out.println("------End of list-------");
    }

    /**
     * Метод считывания данных с консоли
     * @param message Сообщение пользователю
     * @return верннет введенные данные с консоли
     */
    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
