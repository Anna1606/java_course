/*
Вводится число n, затем n целых чисел.
Определите, сколько различных чисел было введено.
Sample Input:
7
1 1 2 2 2 3 3
Sample Output:
3
class Task_1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
}
}

 */

package seminar_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task1_s5 {
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input count number: ");
        int n = iScanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            set.add(iScanner.nextInt());
        }
        System.out.println(set.size());
    }
}
