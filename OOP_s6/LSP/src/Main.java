public class Main {
    public static void main(String[] args) {
        // создаем Квадрат
        Square square = new Square();
        // задаем длину стороны квадрата
        square.setWidth(7);
        // выводим на консоль площадь квадрата
        System.out.println(square.area());

        // создаем Прямоугольник
        Rectangle rectangle = new Rectangle();
        // задаем длину прямоугольника
        rectangle.setWidth(7);
        // задаем высоту прямоугольника
        rectangle.setHeight(5);
        // выводим на консоль площадь прямоугольника
        System.out.println(rectangle.area());

    }
}