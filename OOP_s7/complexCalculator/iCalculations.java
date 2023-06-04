package complexCalculator;

/**
 * Это интерфейс с перечнем возможных действий калькулятора
 */
public interface iCalculations {
    /** Метод сложения комплексных чисел */
    iCalculations sum(ComplexNumber arg);
    /** Метод умножения комплексных чисел */
    iCalculations multi(ComplexNumber arg);
    /** Метод деления комплексных чисел */
    iCalculations del(ComplexNumber arg);
    /** Получение результата вычислений */
    ComplexNumber getResult();
}
