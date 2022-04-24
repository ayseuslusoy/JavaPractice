package day39_EncapsulationAndInheritance.shapeTask;
public class ShapeObjects {
    public static void main(String[] args) {
        Square square = new Square("Square", 10);
        System.out.println(square);
        Rectangle rectangle=new Rectangle(5,6);
        System.out.println(rectangle);
        rectangle.setLength(10);//Eger verdigimiz degeri tekrar degistirmek istersek set metot kullanilir
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        Circle circle=new Circle( 7);
        System.out.println(circle);


    }
}