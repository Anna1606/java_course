/*В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег
на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
Входные данные
Программа получает на вход действительные числа x и y
Выходные данные
Программа должна вывести одно натуральное число.
Sample Input:
10
20
Sample Output:
9
*/

package seminar_1;

import java.util.Scanner;

public class task3_s1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("speed at first day: ");
        double x = iScanner.nextDouble();
        System.out.printf("speed at finish day: ");
        double y = iScanner.nextDouble();
        iScanner.close();

        int count = 1;
        while (x < y) {
            x = x + x * 0.1;
            ++count;
        }
        System.out.println(count);
    }

}
