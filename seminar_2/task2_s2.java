/*Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. 
Затем вводится строка, в которой перечислены слова, которые написаны в газете.
Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
Sample Input:
а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:
7
5
*/
package seminar_2;
import java.util.Scanner;

public class task2_s2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Любимая буква Маши: ");
        String m = iScanner.next();
        System.out.printf("Любимая буква Олега: ");
        String o = iScanner.next();
        String g = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        iScanner.close();
        String [] sample = g.split(" ");

        int cntM = 0;
        int cntO = 0;
        for (int i = 0; i < sample.length; i++) {
            if (sample[i].indexOf(m) != -1) {
                cntM++;
            }
            if (sample[i].indexOf(o) != -1) {
                cntO++;
            }
        }
        System.out.printf("%s, %s\n", cntM, cntO);
    }
}
