/**
 * Класс Бендиновый двигатель (реализует интерфейс запуск двигателя
 */
public class PetrolEngine implements StartEngine{
    // Здесь будет логика запуска бензинового двигателя
    @Override
    public void start() {
        // logic
        System.out.println("Бензиновый двигатель запущен");
    }
}
