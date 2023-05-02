package StudentDomen;

import java.util.List;
/** Обобщенный класс для подсчета среднего возраста пользователей любого типа*/
public class AverageAge <T extends User> {
    /**
     * Метод для подсчета среднего возраста любого представителя класса Пользователь
     * @param collectionAges Список людей
     * @param <T> метод принимает любой тип пользователей
     * Объявлем переменную для подсчета суммы возраста всех людей из списка
     *           и выводим на печать средний возраст переданного списка людей
     */
    static public <T extends User> void getMidleAge(List<T> collectionAges){

        int sum = 0;
        for (T user : collectionAges){
            sum = sum + user.getAge();
        }

        System.out.printf("Средний возраст = %d \n", sum/collectionAges.size());
    }
}
