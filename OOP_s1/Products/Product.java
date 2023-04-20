package OOP_s1.Products;
/**
 * Базовый класс продукта
 * */
public class Product {
    /** наименование продукта*/
    private String name;
    /** цена продукта */
    private Double price;

    /**
     * конструктор продукта 2 параметра
     * @param name это наименование продукта
     * @param price это цена продукта
     */
    public Product(String name, Double price) {
        this(name);
        if (name == "") {
            throw new IllegalStateException(String.format("У продукта отстутсвует наименование!", name));
            // генерация ошибки в случае если нет наименования продукта
        }
        this.price = price;
    }

    /**
     * конструктор продукта 1 параметр
     * @param name это наименование продукта
     */
    public Product(String name){
        this.name = name;
    }
    /** получаем наименование продукта */
    public String getName(){
        return name;
    }

    /**
     * устанавливаем цену продукта
     * @param value это цена продукта
     */
    public void setPrice(Double value){
        if (value <= 0){
            throw new IllegalStateException(String.format("Цена указана некорректно", value));
            // return;
        }
        this.price = value;
    }
    /** получаем цену продукта */
    public Double getPrice(){
        return price;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString(){
        return "Product{" +
                "name=" + name + '\'' +
                ", cost=" + price +
                '}';
    }
}
