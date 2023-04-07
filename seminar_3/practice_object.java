package seminar_3;

import java.util.ArrayList;
import java.util.List;

public class practice_object {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>(); // создание объекта типа String, тип указывается в угловых скобках
        listString.add("Red"); // добавление значения в массив
        listString.add("Green");
        listString.add("Blue");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString); // вывод на экран всего массива
        for (String item: listString) { // перебор значений внутри массива
            System.out.println(item);
        }
        System.out.println(listString.get(0)); // обращение к конкретному элементу массива по индексу при помощи метода get

        listString.set(2, "Yellow"); // метод set позволяет изменить конкретный элемент массива по индексу этого элемента
        System.out.println(listString);

        listString.remove(3); // удаление объекта под конктерным индексом
        System.out.println(listString);
        listString.indexOf("Red"); // найти где находится какой-то объект (его индекс)


    }
}
