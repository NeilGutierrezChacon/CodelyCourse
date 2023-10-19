public interface Animal {
    void run();
    
}

public interface Fly {
    void fly();
}

public interface Bark {
    void bark();
}

public class Dog implements Animal, Bark {
    
    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    public void bark() {
        System.out.print("Dog is barking");
    }
}

public class Bird implements Animal, Fly {

    @Override
    public void run() {
        System.out.print("Bird is running");
    }
    
    public void fly() {
        System.out.print("Bird is flying");
    }
}