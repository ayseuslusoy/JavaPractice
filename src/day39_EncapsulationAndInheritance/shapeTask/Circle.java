package day39_EncapsulationAndInheritance.shapeTask;
public class Circle extends Shape {
    private double radius;
    private static double pi=3.14;
    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid radius:"+radius);
            System.exit(1);
        }
        this.radius = radius;
    }
    public static double getPi() {
        return pi;
    }
    public static void setPi(double pi) {
        Circle.pi = pi;
    }
    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +'\'' +
                "pi="+pi +'\'' +
                "area="+area()+'\''+
                "perimeter="+perimeter()+'\''+
                '}';
    }
}

