/*Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
*/

package seminar_1;

import java.util.Scanner;

public class task7_s1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter the number of elements: ");
        int len = iScanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.printf("enter the number: ");
            arr[i] = iScanner.nextInt();
        }
        iScanner.close();

        for (int i = 0; i < len; i++) {
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
