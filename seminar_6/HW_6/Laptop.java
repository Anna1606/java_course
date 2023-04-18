package seminar_6.HW_6;

import java.util.*;

public class Laptop {
    String name;
    String maker; // производитель
    String ram; // оперативная память
    String ssd; // общий объем накопителей
    String CPU; // процессор
    String OS; // операционная система
    String graphics; // видеокарта
   String screen; // диагональ экрана
    String color; // цвет

    public Laptop(String name, String maker, String ram, String ssd, String CPU, String OS,
                  String graphics, String screen, String color) {
        this.maker = maker; // значение параметра maker  присваевается полю maker
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.CPU = CPU;
        this.OS = OS;
        this.graphics = graphics;
        this.screen = screen;
        this.color = color;
    }

 @Override
   public String toString(){ return String.format("%s Ноутбук %s %s, %s, %s ГБ, %s ГБ, %s, %s, %s\n",
                screen, maker, name, CPU, ram, ssd, graphics, OS, color);}

}
