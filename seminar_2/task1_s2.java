/* Дана строка, в которой через пробел перечислены цифры. 
На следующей строке вводится цифра.
Определите индексы первого и последнего её вхождения.
 * 
 * Sample Input:
 * 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
 * 4
 * Sample Output:
 * 0
 * 28
 */

package seminar_2;
import java.util.Scanner;

public class task1_s2 {
    public static void main(String[] args) {
        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        String n = iScanner.next();
        iScanner.close();
        System.out.println(str.indexOf(n));
        System.out.println(str.lastIndexOf(n));
    }

}
