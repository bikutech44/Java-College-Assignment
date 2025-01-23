class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}
class Mammal extends Animal {
    void drinkMilk() {
        System.out.println("Mammal drinks milk.");
    }
}
class Human extends Mammal {
    @Override
    void eat() {
        System.out.println("Human eats cooked food.");
    }
}
public class InheritanceExample2MultilevelInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.drinkMilk();
    }
}
