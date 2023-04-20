package OOP_s1.VendingMachines;

import OOP_s1.Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    /** вместимость аппарата */
    private int capacity;
    /** наименования продуктов в аппарате */
    private List<Product> products;
    /** коллекция возможных действий в аппарате*/
    private List<String> workLog;

    /**
     * Конструктор VendingMachine
     * @param capacity это вместимость аппарата
     */
    public VendingMachine(int capacity){
        this.capacity = capacity;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    /**
     * Добавляем продукт в аппарат
     * @param prod это продукт, который нужно добавить в аппарат
     */
    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    /** Добавить действие, совершаемое в аппарате*/
    public void addSales(String line)
    {
        workLog.add(line);
    }

    /**
     * найти продукт в списке по имени
     * @param name это имя продукта
     * @return вернуть этот продукт из списка
     */
    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    /** Получить все продукты, которые есть в аппарате*/
    public List<Product> getProdAll()
    {
        return products;
    }

}
