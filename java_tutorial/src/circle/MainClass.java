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
        System.out.println("Cylinder Volume: "+ cylinder.getCylinderVolume());
        System.out.println("Cylinder Surface Area: "+ cylinder.getCylinderSurfaceArea());
        System.out.println("*******************************************************************************");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("*******************************************************************************");
        System.out.println("Corn");
        Corn corn = new Corn(7, 10);
        System.out.println();
        System.out.println("Corn height: "+ corn.getHeight());
        System.out.println("Corn radius: "+ corn.getRadius());
        System.out.println("Corn Volume Formula: "+ corn.getCornVolumeFormula());
        System.out.println("Corn Volume: "+ corn.getCornVolume());
        System.out.println("Cylinder Surface Formula: "+ corn.getCornSurfaceAreaFormula());
        System.out.println("Cylinder Surface Area: "+ corn.getCornSurfaceArea());
        System.out.println("*******************************************************************************");
    }
}
