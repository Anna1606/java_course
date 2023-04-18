package seminar_6;

public class task2_s6 {
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальные для приложения
    // которое является:
    // а) информационной системой ухода за ней
    // б) архивом выставки будьдожков
    // в) информационной системой Театра бульдожек имени Дорахвелидзе

    public static void main(String[] args) {
        Buldogka Sobaka = new Buldogka (5, 30, "Buldog", "Gav", "Anton");
        Buldogka Sobaka2 = new Buldogka (5, 30, "Чихуа-хуа", "Gav2", "Dmitriy");

        Sobaka.gladit();

        System.out.println(Sobaka.getName());

        Sobaka2.newVystavka("КОнкурс красоты");
        Sobaka2.newVystavka("Мисс вселенная");

        Sobaka2.getVystavka();

        Sobaka2.getAll();

    }
}
