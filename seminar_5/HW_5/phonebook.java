/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов.

Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.

Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

package seminar_5.HW_5;

import java.util.*;

public class phonebook {
    public static void heapify(List<Integer> a, int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n)
            if (a.get(child) > a.get(max))
                max = child;
        if (child + 1 < n)
            if (a.get(child + 1) > a.get(max))
                max = child + 1;
        if (max != i) {
            int temp = a.get(i);
            a.set(i, a.get(max));
            a.set(max, temp);
            heapify(a, n, max);
        }
    }

    public static void buildheap(List<Integer> a) {
        for (int i = a.size() / 2 - 1; i >= 0; i--)
            heapify(a, a.size(), i);
    }

    public static void heapSort(List<Integer> a) {
        buildheap(a);
        for (int i = a.size() - 1; i >= 1; i--) {
            int temp = a.get(0);
            a.set(0, a.get(i));
            a.set(i, temp);
            heapify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        // создаем телефонный справочник
        HashMap<String, List<Integer>> peoples = new HashMap<>(Map.ofEntries(Map.entry("Иван Иванов", Arrays.asList(123, 456)),
                Map.entry("Светлана Петрова", Arrays.asList(129)), Map.entry("Кристина Белова", Arrays.asList(159)),
                Map.entry("Анна Мусина", Arrays.asList(753)), Map.entry("Анна Крутова", Arrays.asList(963)),
                Map.entry("Иван Юрин", Arrays.asList(852)), Map.entry("Петр Лыков", Arrays.asList(741)),
                Map.entry("Павел Чернов", Arrays.asList(741)), Map.entry("Петр Чернышов", Arrays.asList(485)),
                Map.entry("Мария Федорова", Arrays.asList(856)), Map.entry("Марина Светлова", Arrays.asList(236)),
                Map.entry("Мария Савина", Arrays.asList(125)), Map.entry("Мария Рыкова", Arrays.asList(965)),
                Map.entry("Марина Лугова", Arrays.asList(762)), Map.entry("Анна Владимирова", Arrays.asList(597)),
                Map.entry("Иван Мечников", Arrays.asList(591)), Map.entry("Петр Петин", Arrays.asList(538)),
                Map.entry("Иван Ежов", Arrays.asList(172))));

        HashMap<String, Integer> popularNames = new HashMap<>();

        // создаем справочник имен с количеством популярности
        for (var item : peoples.entrySet()) {
            String[] str = new String[]{};
            String name = "";
            str = item.toString().split(" ");
            name = str[0];
            if (popularNames.containsKey(name)) {
                int count = popularNames.get(name) + 1;
                popularNames.put(name, count);
            } else {
                popularNames.put(name, 1);
            }
        }
        // удаляем непопулярные имена, т.е. те, которые встречаются только один раз
        List<String> names = new ArrayList<>(popularNames.keySet());
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (popularNames.get(name) == 1) {
                popularNames.remove(name);
            }
        }

        List<Integer> popularList = new ArrayList<>(popularNames.values());
        popularNames.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


        heapSort(popularList);
        System.out.println(popularList);

    }
}
