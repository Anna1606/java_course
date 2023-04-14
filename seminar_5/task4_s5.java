/*
import java.util.List;
import java.util.Map;
public class Task_4 {
Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь,
идущий от ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути,
ведущего в другой город.
Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
public static void main(final String[] args) {

}

public String getFinalCity(final Map<String, String> map){
    return "";
}
}

 */

package seminar_5;

import java.util.*;

public class task4_s5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>(Map.of(
                "Москва", "Самара",
                "Курск", "Пенза",
                "Самара", "Курск",
                "Пенза", "Мурманск"
        ));
            for (String values : map.values()) {
                if (!map.containsKey(values)) { // если в словаре нет ключа равного значению
                    list.add(values);
                }
            }
        System.out.println(list);
    }
}
