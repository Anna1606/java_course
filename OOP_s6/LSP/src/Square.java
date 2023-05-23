/**
 * Класс фигуры Квадрат
 */
public class Square {
    /** Длина стороны квадрата */
    int width;
    /** задать длину стороны квадрата */
    public void setWidth(int width) {
        this.width = width;
    }
    /** Метод расчета площади квадрата */
    public int area() {
        return this.width * this.width;
    }
}
