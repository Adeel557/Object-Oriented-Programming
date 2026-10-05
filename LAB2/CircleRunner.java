package LAB2;
class Circle2 {
    private double radius;


    public Circle2() {
        radius = 7;
    }

    public Circle2(double r) {
        radius = r;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void display() {
        System.out.println("radius: " + radius);
    }

    public double circumference() {
        double a = 3.14 * radius * radius;
        return a;
    }
}

public class CircleRunner{
    public static void main(String[] args){
        Circle2 c1 = new Circle2();
        c1.display();
        System.out.println("Circumference of c1 = " + c1.circumference() );

        Circle2 c2= new Circle2(5);
        System.out.println(c2.circumference());
        c2.display();

        Circle2 c3 = new Circle2();
        c3.setRadius(2);
        c3.display();
        System.out.println("Circumference of c3= " + c3.circumference());
    }


}

