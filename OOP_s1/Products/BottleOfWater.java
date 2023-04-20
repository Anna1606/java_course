package OOP_s1.Products;

/**
 * Наследник класса Product
 */
public class BottleOfWater extends Product{

    /** это объем бутылки воды*/
    private int volume;

    /**
     * Это конструктор бутылки с водой
     * @param name это наименование
     * @param price это цена за бутылку
     * @param volume это объем воды в бутылке
     */
    public BottleOfWater(String name, double price, int volume){
        /** означает взять переменные из класса родителя */
        super(name, price);
        this.volume = volume;
    }

    /** Добавить объем бутылки*/
    public void setVolume(int volume){
        this.volume = volume;
    }

    /** Получить объем бутылки*/
    public int getVolume() {
        return volume;
    }

    /**
     * Это переопределение метода
     */
    @Override
    public String toString(){
        return  "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                '}';
    }
}
