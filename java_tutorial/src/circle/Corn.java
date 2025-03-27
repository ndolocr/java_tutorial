package circle;

public class Corn extends Cylinder{
    public Corn(double radius, double height){
        super(radius, height);
    }

    public String getCornVolumeFormula(){
        return "Volume = (1/3)πr²h";
    }

    public double getCornVolume(){
        return  this.getVolume()/3;
    }

    public String getCornSurfaceAreaFormula(){
        return "Surface Area = 2πr(r + h)";
    }

    public  double getCornSurfaceArea(){
        return (2*Math.PI*this.getRadius()*(this.getRadius() + this.getHeight()));
    }

}
