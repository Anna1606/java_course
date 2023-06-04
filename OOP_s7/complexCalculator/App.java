package complexCalculator;
public class App {
    public static void main(String[] args) {
        // создаем Фабрику, производящую калькулятор комплексных чисел, включающий его логгирование
        iCalculationsFactory calculationsFactory = new DecLogCopmlexCalcFactory(new LoggerComplex());
        // создаем визуальное меню пользователя и запускаем калькулятор
        ViewComplexCalc view = new ViewComplexCalc(calculationsFactory);
        view.run();
    }
}
