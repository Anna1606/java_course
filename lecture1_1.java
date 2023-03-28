/* Это многострочный
 * комментарий
 */
// Это однострочный комментарий

public class lecture1_1 {
    public static void main(String[] args){
        // целочисленные типы данных
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10 , приставка ln в методе print осуществляет перенос курсора на новую строку
        System.out.println(salary); // 123456

        // вещественные типы данных
        float e = 2.7f; // обязательно для данного типа ставить f после числа!
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        //символьный тип данных
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        //логические типы данных
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); //true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); //true
        boolean flag3 = flag1 ^ flag2; // разделительная дизъюнкция (истина тогда и только тогда, когда одно из значений истина)
        System.out.println(flag3); //false

        //тип данных строка
        String msg = "Hello world";
        System.out.println(msg); // Hello world

        //неявная типизация данных
        var f = 123; // когда заданее неизвестно, какой тип данных будет использоваться
        System.out.println(f); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(f)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        //d = "mistake":
        //error: incompatible types:
        //String cannot be converted to double

        // как работает инкремент в java
        int a = 123;
        System.out.println(a ++); // постфиксный инкремент (сначала выводит значение на консоль, а потом совершает сложение)
        System.out.println(a);
    
        int b = 123;
        System.out.println(++ b); // префиксный инкремент (сначала выполняется сложение, а потом вывод в консоль)
        System.out.println(b);

        // одномерные массивы
        int[] arr = new int[10]; // объявление нового массива длиной 10 символов равных 0
        System.out.println(arr.length); // 10
        System.out.println(arr[3]); // 0
        arr[3] = 13; // присвоить значение элементу массива с индексом 3
        System.out.println(arr[3]); // 13

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        //многомерные массивы
        int[] brr[] = new int[3][5]; //объявление массива в 3 строки и 5 столбцов
        for (int[] line : brr) {
            for (int item : line) {
                System.out.printf("%d ", item); // приставка f в методе print означает форматированный вывод значений, в данном случае используется %d
            }
            System.out.println();
        }
        // массив массивов
        int[][] crr = new int[3][5];
        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                System.out.printf("d% ", crr[i][j]);
            }
            System.out.println();
        }

        //преобразования явные и неявные
        int g = 123; double k = g; // k = g это неявное преобразование
        System.out.println(g); // 123
        System.out.println(k); // 123.0
        k = 3.1415; g = (int)k;
        System.out.println(k); // 3.1415
        System.out.println(g); // 3
        k = 3.9415; g = (int)k;
        System.out.println(k); // 3.9415
        System.out.println(g); // 3
        byte l = Byte.parseByte("123");
        System.out.println(l); // 123
        l = Byte.parseByte("1234"); // явное преобразование
        System.out.println(l); // NumberFormatException: Value out of range

        // но НЕЛЬЗЯ положить массив целых чисел в массив вещественных чисел
        // int[] m = new int[10];
        // double[] c = m; // ИЗУЧАЕМ ковариантность и контравариантность

    }
    static String getType(Object o) {   //метод нужен для получения типа данных в коде
        return o.getClass().getSimpleName();
    }
}
