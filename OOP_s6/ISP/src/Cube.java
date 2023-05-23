/**
 * Класс фигуры Куб (реализует интерфейсы Форма и Объем)
 */
public class Cube implements Shape, Volume{
    /** Длина стороны куба */
    private int edge;
    /**
     * Конструктор класса Куб
     * @param edge длина стороны куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Метод определения площади куба
     * @return
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Метод определения объема куба
     * @return
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
