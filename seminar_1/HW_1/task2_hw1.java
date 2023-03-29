/*Вводится число n, затем n чисел целых, по одному на каждой строке. 
Затем вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10 */

package seminar_1.HW_1;

import java.util.Scanner;

public class task2_hw1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter number of numbers: ");
        int n = iScanner.nextInt();
        int[] arr = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("enter a number: ");
            arr[i] = iScanner.nextInt();
        }

        System.out.printf("enter a multiplier: ");
        int multiplier = iScanner.nextInt();
        iScanner.close();

        for (int i = 0; i < n; i++){
            System.out.println(arr[i] * multiplier);
        }
    }
}
