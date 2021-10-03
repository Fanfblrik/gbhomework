package Lesson5;

public class Pers {

    private String fio;
    private String place;
    private String ema;
    private String phone;
    private int age;
    private int zp;

    public Pers(String fio, String place, String ema, String phone, int age, int zp) {

        this.fio = fio;
        this.place = place;
        this.ema = ema;
        this.phone = phone;
        this.age = age;
        this.zp = zp;

    }

    void Info() {
        System.out.println("===============");
        System.out.println("ФИО: " + this.fio);
        System.out.println("Должность: " + this.place);
        System.out.println("e-mail: " + this.ema);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Возраст: " + this.age);
        System.out.println("ЗП: " + this.zp);
    }

    public int getAge(){
        return age;
    }
}
