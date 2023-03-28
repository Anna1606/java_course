/*Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. 
А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
*/

package seminar_1;

import java.util.Scanner;

public class task6_s1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter the number of elements: ");
        int len = iScanner.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            System.out.printf("enter the number: ");
            arr[i] = iScanner.nextInt();
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        iScanner.close();
       System.out.println(sum);
       for (int i = 0; i < len; i++) {
             if (i % 2 == 0) {
                System.out.println(arr[i]);
             }
       }
    }
}
