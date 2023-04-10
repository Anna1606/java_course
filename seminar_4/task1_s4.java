/*
Напишите программу, которая реализует структуру данных очередь, используя список.

Условие задачи таково: пользователь листает список музыки и добавляет в плейлист
понравившиеся ему композиции. Когда песня доигрывает, включается следующая.
Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.

Сначала вводится число n - количество запросов к вашей программе.
Каждый из запросов будет иметь один из следующимх видов:

push <Назавание трека> добавляет трек в плейлист
pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека
состоит из одного слова.

Sample Input:

4
push Трек_1
push Трек_3
pop
push ТрекТрек

Sample Output:
воспроизводится Трек_1
Трек3 ТрекТрек
 */

package seminar_4;
import java.util.*;

public class task1_s4 {
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество операций с треками");
        int n = iScanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = iScanner.next();
            if (str.equalsIgnoreCase("push")){
                String str1 = iScanner.next();
                playlist.add(str1);
            } else if (str.equalsIgnoreCase("pop")) {
                System.out.println("Воспроизводится " + playlist.remove(0));
            }
        }
        System.out.println(playlist);

    }
}
