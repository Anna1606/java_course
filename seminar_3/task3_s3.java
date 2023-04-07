/*
Дан список с десятью случайными числами, нужно отсортировать
 */

package seminar_3;

import java.util.*;

public class task3_s3 {
    public static List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list); //сортировка по возрастанию

        return new ArrayList<Integer>(list);
    }
    public static List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder()); // сортировка по убыванию

        return new ArrayList<Integer>(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        List<Integer> listSort = sortByCollections(list);
        System.out.println(listSort);
        List<Integer> reversSortList = sortByComparator(listSort);
        System.out.println(reversSortList);

    }

}
