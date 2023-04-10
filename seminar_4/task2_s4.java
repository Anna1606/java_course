/*
Напишите программу, которая реализует структуру данных стэк, используя список.

Условие задачи таково: мальчик Петя использует свой стул в качестве многоместной вешалки.
А именно: накидывает на него вещи. Иногда он забирает верхнюю вещь.
Нужно вывести на экран порядок его вещей от спинки стула.

Сначала вводится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один
из следующих видов:

push <одежда> - Петя вешает на стул элемент одежды
pop - снимает одежду со стула. При этом на экран выводится запись вида "Петя взял <одежду>"

Sample Input:
4
push Футболка
push Рубашка
pop
push Джинсы

Sample Output:
 Петя взял рубашка
 Футболка Джинсы
 */

package seminar_4;

import java.util.*;

public class task2_s4 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество операций");
        int n = iScanner.nextInt();
        List<String> chair = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = iScanner.next();
            if (str.equalsIgnoreCase("push")) {
                String str1 = iScanner.next();
                chair.add(str1);
            } else if (str.equalsIgnoreCase("pop")) {
                System.out.println("Петя взял " + chair.remove(chair.size() - 1));
            }
        }
        System.out.println(chair);
    }
}
