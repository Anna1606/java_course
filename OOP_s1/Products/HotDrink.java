package OOP_s1.Products;

/**
 *  Наследник класса Product
 */
public class HotDrink extends Product {
    /** Температура напитка*/
    private int temperature;
    /** объем горячего напитка*/
    private double volume;

    /**
     * Конструктор HotDrink
     * @param name наименование напитка
     * @param price цена напитка
     * @param volume объем напитка
     * @param temperature температура напитка
     */
    public HotDrink(String name, double price, double volume, int temperature){
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    /**
     * Задать температуру напитка
     */
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    /** Узнать температуру напитка */
    public int getTemperature(){
        return temperature;
    }

    /**
     * Переопределение метода toString
     */
    @Override
    public String toString(){
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                ", temperature=" + temperature + '°' +
                '}';
    }

}
