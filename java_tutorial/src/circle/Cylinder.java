package circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);

        if (height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getCylinderVolume(){
        return this.getArea() * this.height;
    }

    public double getCylinderSurfaceArea(){
        double areaOfCircles = this.getArea() * 2;
        double rectangleLength = this.getPerimeter();
        double rectangleArea = rectangleLength * this.height;

        return rectangleArea + areaOfCircles;
    }
}
