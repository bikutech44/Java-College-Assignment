interface Shape {
    void draw(); // Abstract method
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
public class InheritanceExample3InterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
    }
}
