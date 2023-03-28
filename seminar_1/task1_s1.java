/*Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.
Sample Input 1:
10
3
2
Sample Output 1:
8 
*/

package seminar_1;
import java.util.Scanner;

public class task1_s1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Pole height: ");
        int h = iScanner.nextInt();
        System.out.printf("Up at day: ");
        int a = iScanner.nextInt();
        System.out.printf("Down at night: ");
        int b = iScanner.nextInt();
        iScanner.close();
        
        if (a > b) {
            System.out.println((h - b) / (a - b));
        } else {
            System.out.printf("Up at day should be more than down at nigth");
        }
    }
}
