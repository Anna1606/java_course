/**
 * Класс Автомобиль с любым типом двигателя
 */
public class Car {
    /** автомобиль любого типа двигателя */
    private StartEngine engine;

    /**
     * Конструктор автомобиль
     * @param engine тип двигателя
     */
    public Car(StartEngine engine) {
        this.engine = engine;
    }

    /**
     * Запуск двигателя автомобиля любого типа
     */
    public void start() {
        engine.start();
    }
}
