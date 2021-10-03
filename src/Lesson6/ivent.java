package Lesson6;

public class ivent {
///////////////////////////////////
    public static void main(String[] args) {

        dog dog = new dog("Jiji");

        Animal[] members = {
                new dog("Alex"),
                new dog("Dory"),
                new dog("Jeff"),
                new cat("Ann"),
                new cat("Crayg"),
        };

        ((dog) members[0]).run(300);
        ((cat) members[3]).swim(300);
        count(members);

    }

    public static void count(Animal[] members){
        int countAnimal = 0;
        int countDog = 0;
        int countCat = 0;

        for (int i = 0; i < members.length; i++){
            if (members[i] instanceof Animal){
                countAnimal++;
            }
            if (members[i] instanceof dog){
                countDog++;
            } else {
                countCat++;
            }
        }
        System.out.println("Всего животных: " + countAnimal);
        System.out.println("Кошек: " + countCat);
        System.out.println("Собак: " + countDog);
    }

}
