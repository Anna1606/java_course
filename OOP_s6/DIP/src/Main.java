public class Main {
    public static void main(String[] args) {
        // Создаем бензиновый двигатель
        PetrolEngine petrolEngine = new PetrolEngine();
        // Создаем дизельный двигатель
        DieselEngine dieselEngine = new DieselEngine();

        // Создаем машину с бензиновый двигателем
        Car car = new Car(petrolEngine);
        // Запускаем машину с бензиновым двигателем
        car.start();

        // Создаем машину с дизельным двигателем
        Car car1 = new Car(dieselEngine);
        // Запускаем машину с дизельным двигателем
        car1.start();
    }
}