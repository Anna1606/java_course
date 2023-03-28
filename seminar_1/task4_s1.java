/*Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
n! = 1∙2∙3∙…∙ n.
Sample Input:
5
Sample Output:
120
*/

package seminar_1;

import java.util.Scanner;

public class task4_s1 {

    static int factorial(int n) {
            if (n == 1) return 1;
            return n * factorial(n - 1);
        }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("number: ");
        int n = iScanner.nextInt();
        iScanner.close();
        
        if (n > 0) {
            System.out.println(factorial(n));
        } else {
            System.out.printf("number should be more then null");
        }
        
    }
}
