package Lesson3;
//

import java.util.Random;

public class HomeWorkApp3 {


    public static Random random = new Random();

    public static void main(String[] args){

        int[] maslo = new int[5];
        maslo[0] = 0;
        maslo[1] = 0;
        maslo[2] = 1;
        maslo[3] = 1;
        maslo[4] = 1;
        System.out.println("Задание 1");
        for (int i = 0; i < maslo.length; i++){
            System.out.print(maslo[i] + " | ");
        }
        System.out.println();
        masloinv(maslo);
        System.out.println();
        System.out.println("-------------------");

        System.out.println("Задание 2");
        int[] oneh = new int[100];
        onehinput(oneh);
        System.out.println("-------------------");

        System.out.println("Задание 3");
        int[] cif = new int[7];
        for (int i = 0; i < cif.length; i++){
            cif[i] = randomValue(0, 10);
        }
        for (int i = 0; i < cif.length; i++){
            System.out.print(cif[i] + " | ");
        }
        System.out.println();
        cifum(cif);
        System.out.println();
        System.out.println("-------------------");

        System.out.println("Задание 4");
        diagris(5,5);
        System.out.println("-------------------");

        System.out.println("Задание 5");
        mass(4,5);
        System.out.println();
        System.out.println("-------------------");

        System.out.println("Задание 6");
        maspm(cif);
        System.out.println("-------------------");

        System.out.println("Задание 7");
        System.out.println(rlsum(cif));

    }

    public static void masloinv(int[] maslo){
        for (int i = 0; i < maslo.length; i++){
            if (maslo[i] == 0){
                maslo[i] = 1;
            } else{
                maslo[i] = 0;
            }
        }
        for (int i = 0; i < maslo.length; i++){
            System.out.print(maslo[i] + " | ");
        }

    }

    public static void onehinput(int[] oneh){
        for (int i = 0; i < oneh.length; i++){
            oneh[i] = i + 1;
        }
        System.out.println(oneh[34]);
    }

    public static void cifum(int[] cif){
        for (int i = 0; i < cif.length; i++){
             if (cif[i] < 6){
                 cif[i] = cif[i] * 2;
             }
        }
        for (int i = 0; i < cif.length; i++){
            System.out.print(cif[i] + " | ");
        }

    }

    public static void diagris(int height, int width){
        String[][] diag = new String[height][width];

        for (int y = 0; y < diag.length; y++) {
            for (int x = 0; x < diag[y].length; x++) {
                diag[y][x] = "0";
            }
        }

        for (int y = 0; y < diag.length; y++) {
            for (int x = 0; x < diag[y].length; x++) {
                if (y == x){
                    diag[y][x] = "1";
                }
                if (x + y == 4){
                    diag[y][x] = "1";
                }
            }
        }
            for (int y = 0; y < diag.length; y++) {
               for (int x = 0; x < diag[y].length; x++) {
                    System.out.print(diag[y][x] + "\t");
                }
                System.out.println();
            }
    }

    public static void mass(int len,int initialValue){
        int[] mass = new int[len];
        for (int i = 0; i < mass.length; i++){
            mass[i] = initialValue;
        }
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " | ");
        }
    }

    public static void maspm(int[] cif){
    int max = cif[0];
    int min = cif[0];
        for (int i = 0; i < cif.length; i++){
                if (cif[i] >= max){
                    max = cif[i];
                } else if (cif[i] <= min){
                    min = cif[i];
                }
            }
        System.out.println(max + " наибольшее");
        System.out.println(min + " наименьшее");
        }

    public static boolean rlsum(int[] cif){

        int ls = 0;
        int rs = 0;

        for (int i = 0, j = 0; i < cif.length - j; i++)
        {
            ls = ls + cif[i];
            if (ls > rs){
                rs = rs + cif[cif.length - 1 - j++];
            }
        }
        return rs == ls;

    }

    public static int randomValue(int value1, int value2) {
        if (value2 > value1) {
            int tmp = value2 - value1;
            return value1 + random.nextInt(tmp + 1);
        } else {
            System.out.println("Sorry");
            return -1;
        }
    }


}
