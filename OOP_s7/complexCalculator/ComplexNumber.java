package complexCalculator;

/**
 * Этот Класс создает Комплексное число
 */
public class ComplexNumber {
    /** Действительная часть числа */
    private double Re;
    /** Мнимая часть числа */
    private double Im;

    /**
     * Создание экземпляра комплексного числа
     * @param re действительная часть числа
     * @param im мнимая часть числа
     */
    public ComplexNumber(double re, double im) {
        Re = re;
        Im = im;
    }

    /**
     * Вернуть действительную часть числа
     * @return
     */
    public double getRe() {
        return Re;
    }

    /**
     * Вернуть мнимую часть числа
     * @return
     */
    public double getIm() {
        return Im;
    }

    /**
     * Метод печати Комплексного числа
     * @return
     */
    @Override
    public String toString(){
        return "(" + Re + "; " + Im + "i" + ")";
    }
}
