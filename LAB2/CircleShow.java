package LAB2;

class Circle {
    public double radius;
    public String color;

    public Circle() {
        radius = 2;
        color = "Red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double circumference() {
        return 2 * (Math.PI * radius);
    }

}

public class CircleShow{
    public static void main(String[] args){
        Circle cir = new Circle();
        System.out.println("Circumference without argument: " + cir.circumference());
        Circle cir2= new Circle(4.0, "Pink");
        System.out.print("Circumference with argument: " + cir2.circumference());
    }
}