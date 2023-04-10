/*
Дан Deque, состоящий из последовательности цифр.
Необходимо проверить, что последовательность цифр является палиндромом
 */

package seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task3_s4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6, 5, 4, 3, 4, 5, 6));
        boolean res = true; //по умолчанию список является палиндромом(флаг)
        for (int i = 0; i < deque.size() / 2; i++) {
            int f = deque.pollFirst(); // получает и удаляет первый элемент двухстронней очереди
            int l = deque.pollLast(); // получает и удаляет последний элемент двухсторонней очереди
            if (f != l){
                res = false;
                break;
            }
        }
        System.out.println(res ? "Палиндром" : "Не палиндром");
    }
}
