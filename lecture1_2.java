
//Получение данных из терминала
import java.util.Scanner; //нужно для получения данных из терминала от пользователя, класс Scanner находится в пакете java.util, мы вначале его импортируем 

public class lecture1_2 {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in); //переменнная - экземпляр класса сканер, объект in в классе system определен для ввода с консоли
    System.out.printf("name: ");
    String name = iScanner.nextLine(); //nextLine - получение следующей строки
    System.out.printf("Привет, %s!\n", name);
    iScanner.close();

    //некоторые примитивы
    Scanner jScanner = new Scanner(System.in);
    System.out.printf("int a: ");
    int x = jScanner.nextInt();
    System.out.printf("double a: ");
    double y = jScanner.nextDouble();
    System.out.printf("%d + %f = %f", x, y, x + y);
    jScanner.close();

    // Проверка на соответствие получаемого типа (пользователь банан:)
    Scanner iScanner2 = new Scanner(System.in);
    System.out.printf("int a: ");
    boolean flag = iScanner2.hasNextInt(); // метод, который говорит, что должно быть число и возвращает true или false
    System.out.println(flag);
    int i = iScanner2.nextInt();
    System.out.println(i);
    iScanner2.close();

    //Форматированный вывод
    int a = 1, b = 2;
    int c = a + b;
    String res = a + " + " + b + " = " + c;
    // String res = String.format("%d + %d = %d \n", a, b, c);  //первый аргумент как должно выглядеть, второй переменные, под заданные формат
    // System.out.printf("%d + %d = %d \n", a, b, c); // \n означает перенос на новую строку
    System.out.println(res);
    
    // Виды спецификаторов
    /* %d целочисленные значения
     * %x шестнадцатеричные числа
     * %f вывод чисел с плавающей точкой
     * %e вывод чисел в экспоненциальной форме, например, 3.1415e+01
     * %c вывод одиночного символа
     * %s вывод строковых значений
     */
    // спецификаторы для вывода количества знаков после запятой
    float pi = 3.1415f;
    System.out.printf("%f\n", pi);   // 3,141500
    System.out.printf("%.2f\n", pi); // 3,14
    System.out.printf("%.3f\n", pi); // 3,141
    System.out.printf("%e\n", pi);   // 3,141500e+00
    System.out.printf("%.2e\n", pi); // 3,14e+00
    System.out.printf("%.3e\n", pi); // 3,141e+00
    
    }
}

/*Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:

next(): считывает введенную строку до первого пробела

nextLine(): считывает всю введенную строку

nextInt(): считывает введенное число int

nextDouble(): считывает введенное число double

nextBoolean(): считывает значение boolean

nextByte(): считывает введенное число byte

nextFloat(): считывает введенное число float

nextShort(): считывает введенное число short

То есть для ввода значений каждого примитивного типа в классе Scanner определен свой метод.
*/