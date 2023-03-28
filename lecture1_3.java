
public class lecture1_3 {
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static double factor(int n) {
        if(n == 1) return 1;
        return n * factor(n - 1);
    }
    public static void main(String[] args) {
        // Функции и методы

        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0

        // Управляющие конструкции: условный оператор
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }

        // второй вариант записи (сокращенный)
        // int a = 1;
        // int b = 2;
        // int c = 0;
        // if (a > b) c = a;
        // if (b > c) c = b;

        // вариант записи с тернарным оператором
        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b; // если условие выполняется, то вернется значение, указанное межу ? и :,
        //                             если не выполняется, то вернется значение после :
        // System.out.println(min);
        System.out.println(c);

        // оператор выбора
        int mounth = 1;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            
            default:
            text = "mistake";
                break;
        }
        System.out.println(text);
        
        //Цикл while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        //Цикл do while (цикл с постусловием)
        int val = 321;
        int cnt = 0;

        do {
            val /= 10;
            cnt++;
        } while (val != 0);
        System.out.println(cnt);

        //цикл foreach - перебор коллекции данных (например перебор значений массива)
        int[] arr = new int[]{1, 2, 3, 4, 5, 77};
        for (int item : arr) {
            System.out.println(item);
        }
    }
    
}
