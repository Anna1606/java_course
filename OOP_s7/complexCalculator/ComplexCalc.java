package complexCalculator;

/**
 * Это калькулятор комплексных чисел
 */
public final class ComplexCalc implements iCalculations{
    /** Объявляем первое комплексное число*/
    private ComplexNumber primaryArg;

    /**
     * Это конструктор первого комплексного числа
     * @param primaryArg
     */
    public ComplexCalc(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    /**
     * Метод вычисления суммы комплексных чисел
     * @param arg второе комплексное число
     * @return
     */
    @Override
    public iCalculations sum(ComplexNumber arg) {
        double Re = primaryArg.getRe() + arg.getRe();
        double Im = primaryArg.getIm() + arg.getIm();
        primaryArg = new ComplexNumber(Re,Im);
        return this;
    }

    /**
     * Метод вычисления произведения комплексных чисел
     * @param arg второе комплексное число
     * @return
     */
    @Override
    public iCalculations multi(ComplexNumber arg) {
        double Re = primaryArg.getRe()*arg.getRe() - primaryArg.getIm()*arg.getIm();
        double Im = primaryArg.getRe()*arg.getIm() + primaryArg.getIm()*arg.getRe();
        primaryArg = new ComplexNumber(Re,Im);
        return this;
    }

    /**
     * Метод вычисления частного комплексных чисел
     * @param arg второе комплексное число
     * @return
     */
    @Override
    public iCalculations del(ComplexNumber arg) {
        double denominator = arg.getRe() * arg.getRe() + arg.getIm() * arg.getIm();
        double Re = (primaryArg.getRe()*arg.getRe() + primaryArg.getIm()*arg.getIm())/denominator;
        double Im = (primaryArg.getIm() * arg.getRe() - primaryArg.getRe() * arg.getIm())/denominator;
        primaryArg = new ComplexNumber(Re, Im);
        return this;
    }

    /**
     * Метод получения результата вычислений комплексных чисел
     * @return
     */
    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
