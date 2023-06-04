package complexCalculator;

import java.util.Scanner;

/**
 * Класс, описывающий внешний вид калькулятора
 */
public class ViewComplexCalc {
    /** Создаем Фабрику калькулятора комплексных чисел*/
    private iCalculationsFactory calculationsFactory;

    /**
     * Конструктор пользовательского интерфейса Калькулятора комплексных чисел
     * @param calculationsFactory Фабрика калькулятора комплексных чисел
     */
    public ViewComplexCalc(iCalculationsFactory calculationsFactory) {
        this.calculationsFactory = calculationsFactory;
    }

    /**
     * Запуск пользовательского интерфейса калькулятора комплексных чисел
     */
    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplex("Введите действительную часть аргумента: ",
                                                     "Введите мнимую часть аргумента: ");
            iCalculations calculator = calculationsFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplex("Введите действительную часть второго аргумента: ",
                                            "Введите мнимую часть второго аргумента: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplex("Введите действительную часть второго аргумента: ",
                            "Введите мнимую часть второго аргумента: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplex("Введите действительную часть второго аргумента: ",
                            "Введите мнимую часть второго аргумента");
                    calculator.del(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат: " + result + " ");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)? ");
            if (cmd.equalsIgnoreCase("y")) {
                continue;
            }
            break;
        }
    }
    /** Метод считывания данных от пользователя */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Метод создания комплексного числа пользователем
     * @param message1 Запрос действительной части комплексного числа
     * @param message2 Запрос мнимой части комплексного числа
     * @return
     */
    private ComplexNumber promptComplex(String message1, String message2) {
        Scanner in = new Scanner(System.in);
        System.out.print(message1);
        double re = Double.parseDouble(in.nextLine());
        System.out.println(message2);
        double im = Double.parseDouble(in.nextLine());

        return new ComplexNumber(re,im);
    }
}
