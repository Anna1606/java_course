/*public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {

}

public String findJewelsInStones(String jewels, String stones) {

    return "";
}
}
*/

package seminar_2.HW_2;

public class task0_hw2 {
    public static String findJewelsInStones (String jewels, String stones) {
        char[] arrStones = stones.toCharArray();
        char[] arrJewels = jewels.toCharArray();
        String res = "";
        for (int i = 0; i < arrJewels.length; i++) {
            int count = 0;
            for (int j = 0; j < arrStones.length; j++) {

                if (arrStones[j] == arrJewels[i]){
                    count ++;
                }
            }
            res = res + arrJewels[i] + count;
        }
        return res;
    }
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";

        System.out.println(findJewelsInStones(jewels, stones));
    }
}
