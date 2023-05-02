package StudentDomen;

import java.util.Comparator;

/**
 * Метод для сравнения типов пользователей по фамилии и имени
 * Возвращает отсортированный список
 */
public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {

        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0){
            resultOfComparing = o1.getName().compareTo(o2.getName());
            return  resultOfComparing;
        }else {
            return resultOfComparing;
        }
    }
}
