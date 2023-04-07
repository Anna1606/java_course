// Реализовать алгоритм сортировки слиянием и выборкой.

package seminar_3.HW_3;

import java.util.*;

public class task1_hw3 {
    public static void mergeSort(List<Integer> list, int sizeList){
        if (sizeList < 2){ // разбиваем подмассивы до тех пор, пока каждый массив не будет длинной 1 в элемент
            return;
        }
        int middle = sizeList/2; // середина массива
        List<Integer> leftList = new ArrayList<>(middle); // создаем лист слева от середины исходного массива
        List<Integer> rightList = new ArrayList<>((sizeList - middle)); // создаем лист справа от середины исходного массива

        for (int i = 0; i < middle; i++) { // проходим по элементам левого массива
            leftList.add(i, list.get(i));
        }
        for (int i = middle; i < sizeList; i++) { // проходим по элементам правого массива
            rightList.add((i - middle), list.get(i));
        }

        mergeSort(leftList, middle); //разбиваем левую сторону рекурсией
        mergeSort(rightList, sizeList-middle); // разбиваем правую сторону рекурсией
        merge(list, leftList, rightList, middle, sizeList - middle); // получаем отсортированный исходный массив

    }
    public static void merge(List<Integer> list, List<Integer> leftList, List<Integer> rightList,
                             int leftSize, int rightSize){
        int i = 0; //счетчик слева
        int j = 0; //счетчик справа
        int k = 0; //счетчик основного листа
        while (i < leftSize && j < rightSize){ // идем по обеим сторонам массива до тех пор, пока одна из них не закончится
            if(leftList.get(i) <= rightList.get(j)){
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }
        while (i < leftSize){ // идем только по левой стороне, если правая короче
            list.set(k++, leftList.get(i++));
        }
        while (j < rightSize){ // идем только по правой стороне, если левая короче
            list.set(k++, rightList.get(j++));
        }
    }

    public static void selectionSort(List<Integer> list){
        for (int i = 0; i <list.size() ; i++) { // номер текущего шага по основному массиву. i меняется,
                                                // когда во внутреннем цикле найден минимальный элемент, из оставшихся
            int minIndex = i;
            int minEl = list.get(i);
            for (int j = i + 1; j <list.size() ; j++) { //выбор наименьшего элемента из оставшихся элементов
                if (list.get(j) < minEl){
                    minIndex = j; // индекс наименьшего элемента
                    minEl = list.get(j);
                }
            }
            list.set(minIndex, list.get(i));
            list.set(i, minEl); // меняем местами найденный наименьший элемент во внутренним цикле,
                                // с текущем элементом в основном цикле
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(list);
        mergeSort(list, list.size());
        selectionSort(list);
        System.out.println(list);




    }
}
