/*Вводится строка, определите, каких символов в ней больше: цифр или букв? 
Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. 
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". 
Если же их равное количество, то выведите слово "Equal".
Sample Input:
34Hi56
Sample Output:
Digit
*/

package seminar_2;
import java.util.Scanner;

public class task5_s2 {
    public static void main(String[] args) {
        String str = "34Hi56";
        int didgitsCnt = 0;
        int alphaCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            if (Character.isDigit(item)) {
                didgitsCnt++;
            }
            if (Character.isLetter(item)) {
                alphaCnt++;
            }
        }
        if (didgitsCnt > alphaCnt) {
            System.out.println("Digit");
        }
        else if (didgitsCnt < alphaCnt){
            System.out.println("Alpha");
        }
        else {
            System.out.println("Equal");
        }
    }
}

