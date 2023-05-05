package Model;

import Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс Хранилище данных типа Файл
 */
public class FileRepo implements iGetModel {
    /** Название файла с указанием его типа*/
    private String fileName;
    /** Список студентов */
    private List<Student> students;

    /**
     * Конструктор хранилища типа Файл
     * @param fileName Назнвание файла с указанием его типа
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        // объявляем пустой список студентов
        this.students = new ArrayList<>();
        // Открываем файл для записи данных
        try (FileWriter fw = new FileWriter(fileName, true)){

            //добавить данные из памяти в файл и закрыть
            fw.flush();

        } catch (Exception e){

            // если есть ошибка, то вывести её на экран
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод добавления студентов в список
     * @param student Данные студента
     */
    public void addStudent(Student student){
        this.students.add(student);
    }

    /**
     * Метод чтения файла с жесткого диска
     */
    public void readAllStudentsFromFile(){
        try {
            // Взять информацию из файла
            File file = new File(fileName);
            // Подключиться к файлу
            FileReader fr = new FileReader(file);
            // Открываем соединение с файлом
            BufferedReader reader = new BufferedReader(fr);
            // Построчно считываем данные из файла
            String line = reader.readLine();
            while (line!=null){

                // Преобразуем каждую строку файла в массив и добавляем студента в список
                String[] param = line.split(" ");
                Student pers = new Student(Integer.parseInt(param[0]), param[1], param[2], param[3], Integer.parseInt(param[4]));
                students.add(pers);
                line = reader.readLine();

            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод сохранения в файл списка студентов
     */
    public void saveAllStudentsToFile(){
        // Открываем файл для записи данных
        try (FileWriter fw = new FileWriter(fileName, true)){
            // Каждого студента из списка преобразуем в строку и записываем в файл
            for (Student pers : students){
                fw.write(pers.getStudentId()+" "+pers.getSurname()+" "+pers.getName()+" "+pers.getFatherName()+" "+pers.getAge());
                fw.append('\n');
            }
            fw.flush();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод печати всех студентов из списка, находящихся в файле
     */
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }

    /**
     * Метод удаления студента по уникальному номеру
     * @param studentId уникальный номер студента
     */
    @Override
    public boolean deleteStudent(int studentId) {
        for (Student pers : students) {
            if (pers.getStudentId() == studentId) {
                students.remove(pers);
                saveAllStudentsToFile();
                return true;
            }
        }
        return false;
    }
}
