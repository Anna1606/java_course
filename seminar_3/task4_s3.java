/*
Дан список, содержащий строки и числа в строковом формате.
С помощью итератора пройти по списку и вывести в консоль, что является строкой, а что числом
 */

package seminar_3;

import java.lang.reflect.GenericArrayType;
import java.util.*;

public class task4_s3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            try { //блок кода, в котором может произойти исключение
                Integer.parseInt(element);
                System.out.println(element + " число");
            } catch (NumberFormatException e){ // блок кода, в котором происходит обработка исключения
                System.out.println(element + " строка");
            }
        }
    }
}
