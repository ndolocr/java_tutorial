package circle;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("**************************************");
        System.out.println("Area of the circle with radius "+ circle.getRadius() +" is: " + circle.getArea());
    }
}
