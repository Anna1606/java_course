package Controller;

import Model.Student;
import View.View;
import View.ViewEng;


import java.util.*;

/**
 * Класс контролллер, регулирующий работу приложения
 */

public class Controller {
    /** Список студентов */
    private List<Student> students;
    /** Список вариантов отображения данных на экране */
    private final List<iGetView> view;
    /** Список вариантов хранилищ данных */
    private List<iGetModel> model;
    /** Выбранный пользователем вариант хранилища данных */
    private iGetModel chooseModel;
    /** Выбранный пользователем вариант отображения данных */
    private iGetView chooseView;
    /** Команда пользователя */
    private String command;

    /**
     * Конструктор Контроллера
     * @param model Список вариантов хранения данных
     */

    public Controller(List<iGetModel> model) {
        this.students = new ArrayList<Student>();
        this.view = new ArrayList<iGetView>(Arrays.asList(new View(), new ViewEng()));
        this.model = model;
    }

    public iGetModel getModel(){
        Scanner in = new Scanner(System.in);
        int choose = 0;
        while (choose < model.size()){
            System.out.println("Choose format data: " +
                    model.get(choose).getClass()+ "\n" +
                    "if Yes - put 1\n" +
                    "if No - put 0\n");
            String userChoose = in.next();
            if (Integer.parseInt(userChoose) == 1) {
                this.chooseModel = model.get(choose);
                break;
            } else {
                choose++;
            }
        }return chooseModel;
    }
    public iGetView getView(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose language: \n" +
                "Русский - введите цифру 1\n" +
                "English - put number 2\n");
        String userChoose = in.next();
        if (Integer.parseInt(userChoose) == 1) {
            this.chooseView = view.get(0);
            return chooseView;
        }
        if (Integer.parseInt(userChoose) == 2){
            this.chooseView = view.get(1);
            return chooseView;
        }else {
            System.out.println("Language choose is not correct. Language will be base");
            this.chooseView = view.get(0);
            return this.chooseView;
        }
    }

    public void getAllStudents(){
//        students = model.getAllStudent();
        students = chooseModel.getAllStudent();
    }

    public boolean testData(){
        if(students.size() > 0){
            return  true;
        } else {
            return false;
        }
    }

    /**
     * Метод отправки на view обновленных данных из model при запросе
     */
    public void updateView(){
        //MVP
        getAllStudents();
        if (testData()){
//            view.printAllStudent(students);
            chooseView.printAllStudent(students);
        }else {
            System.out.println("List of students is empty!");
        }

        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    public void run() {
        Scanner in = new Scanner(System.in);
//        System.out.println("Choose language / выберете язык:\n" +
//                "Русский - введите цифру 1\n" +
//                "English - put number 2\n");
//        int n = in.nextInt();
//        if (n == 1 || n == 2) {
        chooseView = getView();
        chooseModel = getModel();
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            if (chooseView instanceof View) {
//                    this.command = view.prompt("Введите команду: ");
                this.command = chooseView.prompt("Введите команду: ");
            } else {
//                    this.command = viewEng.prompt("Put command: ");
                this.command = chooseView.prompt("Put command: ");
            }
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы");
                    break;

                case LIST:
                    getAllStudents();
                    updateView();
                    break;

                case DELETE:
                    System.out.println("Put student id: ");
                    if (chooseModel.deleteStudent(Integer.parseInt(in.next()))) {
                        System.out.println("Student is deleted");
                    } else {
                        System.out.println("Student id is not found");
                    }
                    break;
            }
        }
    }

}
