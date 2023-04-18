package seminar_6.HW_6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class laptopFilter {
    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Nitro 5 AN515-57", "Acer", "16", "512",
                "Intel Core i5", "Empty", "NVIDIA GeForce RTX 3050", "15.6", "black");
        Laptop laptop2 = new Laptop("MacBook Air 13 Late ", "Apple", "8", "256", "Apple M1",
                "macOS", "Apple graphics 7-core", "13.3", "grey");
        Laptop laptop3 = new Laptop("Ультрабук для работы", "Goods Change Lives", "16", "256",
                "Intel Celeron N5105", "Windows 10 Pro", " Intel UHD Graphics", "15.6", "silver");
        Laptop laptop4 = new Laptop("GF6311UD-223XRU", "MSI", "8", "512", "Intel Core i5",
                "Empty", "NVIDIA GeForce RTX 3050 Ti", "15.6", "black");

        Set<Laptop> set = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));
        Map<String, Set<String>> mapOfParamet = mapOfParametrs();
        addVolumes(set, mapOfParamet);
        Map<String, Set<String>> choosen = choosen(mapOfParamet);
        Set<String> needsLaptop = filter(choosen);
        System.out.println(needsLaptop);
        Set<Laptop> equalsLaptop = equalsLaptop(set, needsLaptop);


        if (equalsLaptop.isEmpty()) {
            System.out.println("Нет ничего подходящего");
        } else {
            System.out.println(equalsLaptop);
                }
    }

    public static Map<String, Set<String>> mapOfParametrs() {
        return new HashMap<>(Map.ofEntries(Map.entry("maker", new HashSet<>()),
                Map.entry("ram", new HashSet<>()), Map.entry("ssd", new HashSet<>()),
                Map.entry("CPU", new HashSet<>()), Map.entry("OS", new HashSet<>()),
                Map.entry("graphics", new HashSet<>()), Map.entry("screen", new HashSet<>()),
                Map.entry("color", new HashSet<>())));
    }

    public static void addVolumes(Set<Laptop> set, Map<String, Set<String>> mapOfParametrs) {
        Set<String> makerp = new HashSet<>();
        Set<String> ramp = new HashSet<>();
        Set<String> ssdp = new HashSet<>();
        Set<String> CPUp = new HashSet<>();
        Set<String> OSp = new HashSet<>();
        Set<String> graphicsp = new HashSet<>();
        Set<String> screenp = new HashSet<>();
        Set<String> colorp = new HashSet<>();
        for (Laptop lap : set) {
            makerp.add(lap.maker);
            ramp.add(String.valueOf(lap.ram));
            CPUp.add(lap.CPU);
            ssdp.add(String.valueOf(lap.ssd));
            OSp.add(lap.OS);
            graphicsp.add(lap.graphics);
            colorp.add(lap.color);
            screenp.add(String.valueOf(lap.screen));
        }
        mapOfParametrs.put("maker", makerp);
        mapOfParametrs.put("ram", ramp);
        mapOfParametrs.put("ssd", ssdp);
        mapOfParametrs.put("CPU", CPUp);
        mapOfParametrs.put("OS", OSp);
        mapOfParametrs.put("graphics", graphicsp);
        mapOfParametrs.put("screen", screenp);
        mapOfParametrs.put("color", colorp);
    }

    public static Map<String, Set<String>> choosen(Map<String, Set<String>> params) {
        Map<String, Set<String>> choosen = new HashMap<>();
        System.out.println("Выбери фильтры");
        for (var keys : params.keySet()) {
            System.out.printf("%s - напиши Yes or No\n", keys);
            if (iScanner.next().equalsIgnoreCase("yes")) {
                choosen.put(keys, params.get(keys));
            }
        }
        return choosen;
    }

    public static Set<String> filter(Map<String, Set<String>> choosen) {
        Set<String> parametr = new HashSet<>();
        for (var need : choosen.keySet()) {
            for (String el : choosen.get(need)) {
                System.out.println("Выбери нужное из списка");
                System.out.printf("%s: %s - напиши Yes or No\n", need, el);
                String ansver = iScanner.next().toLowerCase();
                if (ansver.equalsIgnoreCase("yes")) {
                        parametr.add(el);
                }
            }
        }
        return parametr;
    }

    public static Set<Laptop> equalsLaptop(Set<Laptop> set, Set<String> parametr) {
        Set<Laptop> needLaptop = new HashSet<>();
        for (Laptop lap : set) {
            for (String par : parametr) {
                if (lap.color.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.screen.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.OS.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.ssd.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.CPU.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.graphics.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.ram.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                } else if (lap.maker.equalsIgnoreCase(par)) {
                    needLaptop.add(lap);
                }

            }

        }

        return needLaptop;
    }
}

