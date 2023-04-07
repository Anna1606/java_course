/*
Пусть дан произвольный список целых чисел.
Нужно удалить из него четные числа.
Найти минимальное значение.
Найти максимальное значение.
Найти среднее значение.
 */

package seminar_3;

import java.util.*;

public class task5_s3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.stream().mapToInt(Integer::intValue).average()); //среднее значение
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){ // находим нечетные числа в списке и создаем из них новый список
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
    }
}
