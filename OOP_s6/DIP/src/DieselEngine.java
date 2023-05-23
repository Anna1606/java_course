/**
 * Класс Дизельный двигатель (реализует интерфейс запуска звигателя)
 */
public class DieselEngine implements StartEngine{
    // здесь будет логика запуска дизельного двигателя
    @Override
    public void start() {
        // logic
        System.out.println("Дизельный двигатель запущен");
    }
}
