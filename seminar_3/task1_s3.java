/* Напишите программу, которая считает натуральное число n с клавиуатуры и создаст список,
в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0.
Выведите список на экран через пробел.

Sample Input:
3

Sample Output:
1 0 0 0 1
 */

package seminar_3;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class task1_s3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Add number");
        int n = iScanner.nextInt();
        iScanner.close();
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        for (int i = 0; i < n ; i++) {
            lst.add(0);
        }
        lst.add(1);
        System.out.println(lst);
    }
}
