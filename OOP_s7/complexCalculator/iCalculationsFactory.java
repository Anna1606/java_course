package complexCalculator;
/** Это "Фабрика" по созданию Комплексных чисел */
public interface iCalculationsFactory {
    /**
     * Метод создания комплексного числа
     * @param primaryArg первоначальное комплексное число
     * @return
     */
    iCalculations create(ComplexNumber primaryArg);
}
