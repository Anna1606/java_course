/**
 * Класс транспортного средства типа Автобус (наследник класса Транспортное средство)
 */
public class Bus extends Vehicle{
    /**
     * Конструктор транспортного средства Автобус
     * @param maxSpeed максимальная скорость
     * @param type типа автобуса
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    /** Переопределение расчета допустимой скорости для типа траспорта Автобус */
    @Override
    public double calculateAllowedSpeed() {
        return this.maxSpeed * 0.6;
    }
}
