/**
 * Класс транспортного средства типа Автомобиль (наследник класса Транспортное средство)
 */
public class Car extends Vehicle{
    /**
     * Конструктор класса Автомобиль
     * @param maxSpeed максимальная скорость авто
     * @param type тип авто
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    /** Переопределение расчета допустимой скорости для типа траспорта Автомобиль */
    @Override
    public double calculateAllowedSpeed() {
        return this.maxSpeed * 0.8;
    }
}
