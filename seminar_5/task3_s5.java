/*
// Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
// Пример 1:     In: arr = [1, 2]  Out: 0
// Пример 2:     In: arr = [1, 1, 2]  Out: 1
// Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
 */

package seminar_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class task3_s5 {
    public static int finedPairs(int[] array){
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                set.add(array[i]);
                if (set.contains(array[j])) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1, 2};
        int [] arr1 = new int[]{1, 1, 2};
        int [] arr2 = new int[]{1, 1, 1, 2, 2};
        System.out.println(finedPairs(arr));
        System.out.println(finedPairs(arr1));
        System.out.println(finedPairs(arr2));


    }
}
