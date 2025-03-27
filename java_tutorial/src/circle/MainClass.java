package circle;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("*******************************************************************************");
        System.out.println("Circle");
        System.out.println();
        System.out.println("Circle radius: "+ circle.getRadius());
        System.out.println("Circle area: "+ circle.getArea());
        System.out.println("*******************************************************************************");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("*******************************************************************************");
        System.out.println("Cylinder");
        Cylinder cylinder = new Cylinder(7, 10);
        System.out.println();
        System.out.println("Cylinder height: "+ cylinder.getHeight());
        System.out.println("Cylinder radius: "+ cylinder.getRadius());
        System.out.println("Cylinder Volume: "+ cylinder.getVolume());
        System.out.println("Cylinder Surface Area: "+ cylinder.getSurfaceArea());
        System.out.println("*******************************************************************************");
    }
}
