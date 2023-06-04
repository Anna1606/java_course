package complexCalculator;

/**
 * Класс декоратор, реализующий логгирование калькулятора
 */
public class DecLogComplexCalc implements iCalculations{
    /** декоратор калькулятора комплексных чисел*/
    private iCalculations decoratedComplexCalc;
    /** Логгер действий с комплексными числами*/
    private iLoggableComplex loggerComplex;

    /**
     * Конструктор декоратора калькулятора с подключенным логгированием
     * @param decoratedComplexCalc декоратор калькулятора комплексных чисел
     * @param loggerComplex логгер действий с комплексными числами
     */
    public DecLogComplexCalc(iCalculations decoratedComplexCalc, iLoggableComplex loggerComplex) {
        this.decoratedComplexCalc = decoratedComplexCalc;
        this.loggerComplex = loggerComplex;
    }

    /**
     * Логгирование метода суммы комплексных чисел
     * @param arg второй аргумент суммы комплексных чисел
     * @return
     */
    @Override
    public iCalculations sum(ComplexNumber arg) {
        ComplexNumber firstArg = decoratedComplexCalc.getResult();
        loggerComplex.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum", firstArg));
        loggerComplex.log(String.format("Начало вызова метода sum. Второе значение калькулятора: %s", arg));
        iCalculations result = decoratedComplexCalc.sum(arg);
        loggerComplex.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    /**
     * Логгирование метода умножения комплексных чисел
     * @param arg второй аргумент произведения комплексных чисел
     * @return
     */
    @Override
    public iCalculations multi(ComplexNumber arg) {
        ComplexNumber firstArg = decoratedComplexCalc.getResult();
        loggerComplex.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi", firstArg));
        loggerComplex.log(String.format("Начало вызова метода multi. Второе значение калькулятора: %s", arg));
        iCalculations result = decoratedComplexCalc.multi(arg);
        loggerComplex.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    /**
     * Логгирование метода деления комплексных чисел
     * @param arg второй аргумент произвдения комплексных чисел
     * @return
     */
    @Override
    public iCalculations del(ComplexNumber arg) {
        ComplexNumber firstArg = decoratedComplexCalc.getResult();
        loggerComplex.log(String.format("Первое значение калькулятора %s. Начало вызова метода del", firstArg));
        loggerComplex.log(String.format("Начало вызова метода del. Второе значение калькулятора: %s", arg));
        iCalculations result = decoratedComplexCalc.del(arg);
        loggerComplex.log(String.format("Вызов метода del произошел"));
        return result;
    }

    /**
     * Логгирование метода получения результата расчетов
     * @return
     */
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decoratedComplexCalc.getResult();
        loggerComplex.log(String.format("Получение результата %s", result));
        return result;
    }
}
