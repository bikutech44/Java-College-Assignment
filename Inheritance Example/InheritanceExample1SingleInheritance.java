class Vehicle {
    void wheel() {
        System.out.println("Vehicle have wheels.");
    }
}

class Truck extends Vehicle {
    void wheelCount() {
        System.out.println("Truck have 10 wheels.");
    }
}

public class InheritanceExample1SingleInheritance {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.wheel();
        truck.wheelCount();
    }
}
