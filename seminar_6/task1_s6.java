
package seminar_6;

import java.util.*;

public class task1_s6 {
    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public static int[] initArray(){

        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = random.nextInt(0, 25);
        }

        return array;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и выведите его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

        public static double getPercentUniqueValues(int[] array){

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }

            return set.size() * 100.0 / array.length;

    }
    public static void main(String[] args) {

        int[] array = initArray();
//        for (int i: array) {
//            System.out.printf("%d ", i);
//        }
        System.out.println(getPercentUniqueValues(array));


    }
}
