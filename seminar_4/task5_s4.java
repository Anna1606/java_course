/*
Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
является ли входная строка логически правильной.
Входная строка логически правильная, если:
1) Открытые скобки должны быть закрыты скобками того же типа.
2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответсвующую
()[] = true
() = true
{[()]} = true
()() = true
)()( = false
 */

package seminar_4;

import java.util.*;

public class task5_s4 {
    public static boolean findLogic(String brackets){
        Deque<Character> correctBreckets = new ArrayDeque<>(); // создаем пустую коллекцию символов
        for (char ch : brackets.toCharArray()) { // конвертируем строку в массив символов и идем по элементам
            if (ch == ' ' && brackets.length() == 1){ // если длина строки 1 и символ равен пробелу, то true
                return true;
            } else if (ch == '(' || ch == '[' || ch == '{'){ // если встречаем открывающуюся скобку, то добавляем ее в коллекцию
                correctBreckets.addFirst(ch);
            } else if (correctBreckets.isEmpty() && ch == ')' || // если коллекция пустая и в строке встречается закрытая скобка, то false
                ch == ']' || ch == '}'){
                return false;
            } else if (!correctBreckets.isEmpty() && // если коллекция не пустая, и в ней есть одна из
                                                     // открывающихся скобок, и в строке встречается закрывающаяся скобка
                    (correctBreckets.peekFirst() == '(' && ch == ')') ||
                    (correctBreckets.peekFirst() == '[' && ch == ']') ||
                    (correctBreckets.peekFirst() == '{' && ch == '}')){
                    correctBreckets.removeFirst();
            } else {
                return false;
            }
        }
        return correctBreckets.isEmpty();
    }
    public static void main(String[] args) {
        String brackets = ")()(";
        System.out.println(findLogic(brackets) ? "Правильно" : "Не правильно");

    }
}
