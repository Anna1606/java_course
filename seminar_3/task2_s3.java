/* Напишите программу, которая считает натуральное число n с клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m.
Выведите список на экран через пробел.
 */

package seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2_s3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Add number");
        int n = iScanner.nextInt();
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(String.valueOf(i)); // valueOf() возвращает строковое представление аргументов (у нас это int)
        }
        System.out.println(lst);

        int m = iScanner.nextInt();
        if (m <= n) {
            String s = iScanner.next();
            lst.add(m, s);
        } else {
            System.out.printf("Число должно быть меньше %d \n", n);
        }
        System.out.println(lst);
    }
}
