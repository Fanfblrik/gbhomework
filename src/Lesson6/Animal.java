package Lesson6;

public class Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int s){

        if (maxRun >= s){
            System.out.println(name + " пробежал " + s + " м");
        } else {
            System.out.println(name + " пробежал " + maxRun + " м");
        }

    }

    public void swim(int s){

        if (maxSwim >= s){
            System.out.println(name + " проплыл " + s + " м");
        } else {
            System.out.println(name + " проплыл " + maxSwim + " м");
        }

    }

}
