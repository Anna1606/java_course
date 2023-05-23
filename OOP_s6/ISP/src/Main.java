public class Main {
    public static void main(String[] args) {
        // создаем круг
        Circle circle = new Circle(7);
        // выводим на консоль площадь круга
        System.out.println(circle.area());

        // создаем куб
        Cube cube = new Cube(7);
        // выводим на консоль площадь куба
        System.out.println(cube.area());
        // выводим на консоль объем куба
        System.out.println(cube.volume());
    }
}