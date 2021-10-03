package Lesson5;

public class PSQL {

    public static void main(String[] args) {

        Pers[] persArray = new Pers[5];
        persArray[0] = new Pers("Харитонов Борис Васильевич", "Директор", "haritonovBO@yaza.com", "8 800 555 35 35", 48, 50000);
        persArray[1] = new Pers("Васильева Дарья Викторовна", "Секретарь", "haritonovBO@yaza.com", "8 801 555 35 35", 28, 40000);
        persArray[2] = new Pers("Ханов Владимир Сергеевич", "Менеджер", "haritonovBO@yaza.com", "8 802 555 35 35", 38, 30000);
        persArray[3] = new Pers("Дьяков Василий Павлович ", "Менеджер", "haritonovBO@yaza.com", "8 803 555 35 35", 41, 30000);
        persArray[4] = new Pers("Семьян Иван Иванович", "Менеджер", "haritonovBO@yaza.com", "8 804 555 35 35", 40, 30000);

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].getAge() > 40) {
                persArray[i].Info();
            }
        }
    }

}
