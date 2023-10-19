public interface Animal {
    void run();
    
}

public class Dog implements Animal {
    
    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    public void bark() {
        System.out.print("Dog is barking");
    }
}

public class Bird implements Animal {

    @Override
    public void run() {
        System.out.print("Bird is running");
    }
    
    public void fly() {
        System.out.print("Bird is flying");
    }
}