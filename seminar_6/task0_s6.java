// Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}
// Распечатайте содержимое данного множества.
//public void initHashSet(){
//        }

//Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
//public void initLinkedHashSet(){
//        }

// Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
//public void initTreeSet(){
//        }

package seminar_6;

import java.util.*;

public class task0_s6 {
    public static void initHashSet () {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
    }

    public static void initLinkedHashSet(){
        var a = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(a);
    }

    public static void initTreeSet(){
        var a = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(a);
    }
    public static void main(String[] args) {
        initHashSet();       // [1, 2, 3, 4, 5, 6]
        initLinkedHashSet(); // [1, 2, 3, 4, 5, 6]
        initTreeSet();       // [1, 2, 3, 4, 5, 6]

    }

}
