//Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

package seminar_1.HW_1;

import java.util.Scanner;

public class task3_hw1 {
    public static void main(String[] args) {
       
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значения через enter\n");
        int num1 = iScanner.nextInt();
        String action = iScanner.next();
        int num2 = iScanner.nextInt();
        iScanner.close();
        int res = 0;
        switch (action) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;

            case "*":
                res = num1 * num2;
                break;

            case "/":
                res = num1 / num2;
                break;

            default:
                break;
        }
        System.out.printf("%d %s %d = %d", num1, action, num2, res);
    }
}
