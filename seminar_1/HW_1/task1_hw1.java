/*Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. \
Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
Sample Input:
8
11
Sample Output:
512
1331 */

package seminar_1.HW_1;

import java.util.Scanner;

public class task1_hw1 {
    public static void main(String[] args) {
        double[] arr = new double [1000];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.pow(i + 1, 3);
            }

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Add a number: ");
        int num1 = iScanner.nextInt();
        System.out.printf("Add a number: ");
        int num2 = iScanner.nextInt();
        iScanner.close();

        System.out.println(arr[num1 - 1]);
        System.out.println(arr[num2 - 1]);
    }
}
