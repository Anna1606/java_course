/*
Дан текст: в первой строке записано число строк, далее идут сами строки.
Определите, сколько различных слов содержится в этом тексте.
Словом считается последовательность непробельных символов идущих подряд,
слова разделены одним или большим числом пробелов или символами конца строки.
Sample Input:
4
She sells sea shells on the sea shore;
The shells that she sells are sea shells I'm sure.
So if she sells sea shells on the sea shore,
I'm sure that the shells are sea shore shells.
Sample Output:
19
class Task_5{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
}
}
 */

package seminar_5;

import java.util.HashSet;
import java.util.Set;

public class task5_s5 {
    public static void main(String[] args) {
        String text = "She sells sea shells on the sea shore; " +
                "The shells that she sells are sea shells I'm sure. " +
                "So if she sells sea shells on the sea shore, " +
                "I'm sure that the shells are sea shore shells.";
        String[] words = text.toLowerCase().split("\\s*(\\s|,|!|;|\\.)\\s*");
        Set<String> unicWords = new HashSet<>();
        for (String str: words) {
            unicWords.add(str);
        }
        System.out.println(unicWords);
        System.out.println(unicWords.size());
    }
}
