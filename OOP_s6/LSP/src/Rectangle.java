/**
 * Класс фигуры Прямоугольник (наследник класса Квадрат)
 */
public class Rectangle extends  Square{
    /** Высота прямоугольника */
    private int height;

    /**
     * Задать длину прямоугольника
     * @param width длина прямоугольника
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    /**
     * Задать высоту прямоугольника
     * @param height высота прямоугольника
     */
    public void setHeight(int height) {
        this.height = height;
    }
    /** Метод расчета площади прямоугольника */
    @Override
    public int area() {
        return this.width * this.height;
    }
}
