/*
Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке),
если это число ранее встречалось в последовательности или NO, если не встречалось.
Sample Input:
6
1 2 3 2 3 4
Sample Output:
NO
NO
NO
YES
YES
NO
class Task_2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
}
}

 */

package seminar_5;

import java.util.*;

public class task2_s5 {
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input count number: ");
        int n = iScanner.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int number = iScanner.nextInt();
            if (set.contains(number)){
                System.out.println(" Yes");
            } else {
                System.out.println(" No");
                set.add(number);
            }
        }
    }
}
