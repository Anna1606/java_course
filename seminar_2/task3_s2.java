/*Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. 
Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. 
В следующих трех строках показаны три правильных IP-адреса:
127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
Входные данные
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
Выходные данные
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
Примечание:
У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:
String s = ".";
просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте экранирование.
String s = "\.";
Sample Input 1:
192.168.1.2
Sample Output 1:
YES
Sample Input 2:
192.11.690.0
Sample Output 2:
NO
Sample Input 3:
67.67.67
Sample Output 3:
NO
 */

package seminar_2;

import java.util.Scanner;

public class task3_s2 {
    public static void main(String[] args) {
//        String ipN1 = "127.0.0.0";
//        String ipN2 = "192.168.0.01";
//        String ipN3 = "255.00.255.255";
//
        Scanner iScanner = new Scanner(System.in);
//        for (int i = 1; i <= 3; i++) {
//            String s = "\\.";
//            System.out.printf("Введите ip адрес: ");
//            s = iScanner.next();
//
//            if (s.length() < 15) {
//                if (s.equalsIgnoreCase(ipN1) == true) {
//                    System.out.printf("Yes\n");
//                } else if (s.equalsIgnoreCase(ipN2) == true) {
//                    System.out.printf("Yes\n");
//                } else if (s.equalsIgnoreCase(ipN3) == true) {
//                    System.out.printf("Yes\n");
//                } else {
//                    System.out.printf("No\n");
//                }
//            }
//            else {
//                System.out.printf("Превышено количество символов");
//            }
//        }
        String ipAdress = iScanner.next();
        String[] ip = ipAdress.split(".");

        int count = 0;
        if (ip.length == 4) {
            for (int i = 0; i < ip.length; i++) {
                Scanner scan = new Scanner(ip[i]);
                scan.useDelimiter("\\D+"); //исключить все буквенные символы
                int scanInt = scan.nextInt();
                if (scanInt >= 0 && scanInt <= 255) {
                    count++;
                }
            }
            if (count == 4){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
}
