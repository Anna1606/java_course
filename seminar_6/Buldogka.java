package seminar_6;

import java.util.ArrayList;

public class Buldogka {
    private int age;
    private int mass;
    private String type;
    private String name;
    private String master;
    private ArrayList<String> vystavki = new ArrayList<>();



    public Buldogka (int age, int mass, String type, String name, String master)
    {
        this.age = age;
        this.mass = mass;
        this.type = type;
        this.name = name;
        this.master = master;
    }

    void gladit()
    {
        System.out.println("RRRR");
    }

    String getName()
    {
        return name;
    }

    void newVystavka(String name)
    {
        vystavki.add(name);
    }

    void getVystavka()
    {
        System.out.println("Все выставки бульдожки:");
        for (int i = 0; i < vystavki.size(); i++)
        {
            System.out.println(vystavki.get(i));
        }
    }

    void getAll()
    {
        System.out.println("Кличка - " + name);
        System.out.println("Вес - " + mass);
        System.out.println("Порода - " + type);
        System.out.println("Возраст - " + age);
        System.out.println("Владелец - " + master);

        getVystavka();
    }

}
