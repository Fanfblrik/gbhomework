package Lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args){
        System.out.println(checksum(10,5));
        checkcif(4);
        System.out.println(checkcinv(-50));
        magic(3,"Привет!");
        System.out.println(vyear(404));
    }

    public static boolean checksum(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static void checkcif(int a){
        if (a >= 0){
            System.out.println("Положительное");
        } else{
            System.out.println("Отрицательное");
        }
    }

    public static boolean checkcinv(int a){
        return a < 0;
    }

    public static void magic(int a, String b){
        for (int i = 1; i <= a; i++){
            System.out.println(b);
        }
    }

    public static boolean vyear(int a){
        while (a > 0){
            a = a - 400;
        }
        if(a == 0){
            return true;
        } else {
            a = a + 400;
        }
        while (a > 0){
            a = a - 100;
        }
        if(a == 0){
            return false;
        } else {
            a = a + 100;
        }
        while (a > 0){
           a = a - 4;
        }
        return (a == 0);
    }


}
