package complexCalculator;

/**
 * Декоратор Фабрики создания комплексных чисел, чтобы создать фабрику по созданию
 * логгера калькулятора комплексных чисел
 */
public class DecLogCopmlexCalcFactory implements iCalculationsFactory{
    /** создание калькулятора комплексных чисел с логгером */
    private iLoggableComplex logger;
    /** Конструктор создания логгера комплексных чисел */
    public DecLogCopmlexCalcFactory(iLoggableComplex logger) {
        this.logger = logger;
    }

    /**
     * Создание калькулятора комплексных чисел с логгированием
     * @param primaryArg первоначальное комплексное число
     * @return
     */
    @Override
    public iCalculations create(ComplexNumber primaryArg) {
        return new DecLogComplexCalc(new ComplexCalc(primaryArg), logger);
    }
}
