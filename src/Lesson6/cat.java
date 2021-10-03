package Lesson6;

public class cat extends Animal{

    public cat (String name) {
        super(name);
        this.maxRun = 200;
        this.maxSwim = 0;
    }

    @Override
    public void swim(int s) {
        System.out.println(name + " отказывается плыть");
    }
}


