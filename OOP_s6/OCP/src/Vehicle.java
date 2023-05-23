/**
 * Базовый класс абстрактного транспортного средства
 */
public class Vehicle {
    /** максимальная скорость */
    int maxSpeed;
    /** тип автомобильного транспорта */
    String type;

    /**
     * Конструктор транспортного средства
     * @param maxSpeed максимальная скорость
     * @param type тип транспорта
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /** Получить информацию о максимальной скорости транспорта */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /** Получить информацию о типе транспорта */
    public String getType() {
        return this.type;
    }
    /** Калькулятор расчета допустимой скорости транспортного средства */
    public double calculateAllowedSpeed(){
        return this.maxSpeed * 1.0;
    }
}
