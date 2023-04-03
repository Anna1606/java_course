/*Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. 
Найдите, сколько раз в тексте встречается введённый символ в любом регистре. 
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
Sample Input:
Good morning my dear friend. My fish.
m
Sample Output:
3
*/

package seminar_2;
import java.util.Locale;
import  java.util.Scanner;
public class task4_s2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String text = "Good morning my dear friend. My fish.".toLowerCase();
        System.out.println("Введите искомую букву\n");
        char letter = 'm';
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == letter) { //метод получения значения из строки по индексу
                count++;
            }
        }
        System.out.println(count);
    }
}
