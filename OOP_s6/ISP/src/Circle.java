/**
 * Класс фигуры Окружность (реализует интерфейс Фигура)
 */
public class Circle implements Shape {
    /** Радиус окружности */
    private double radius;

    /**
     * Конструктор фигуры Круг
     * @param radius радиус окружности
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод определения площади окружности
     * @return
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
