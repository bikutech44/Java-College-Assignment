interface Animals {
    void sound();
}

interface Movement {
    void move();
}
class Dog implements Animals, Movement {
    public void sound() {
        System.out.println("Dog barks.");
    }

    public void move() {
        System.out.println("Dog runs on the ground.");
    }
}
public class InheritanceExample4InterfaceExample2 {
    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.sound();
        Movement dogMovement = new Dog();
        dogMovement.move();

    }
}
