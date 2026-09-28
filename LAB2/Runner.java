package LAB2;

class Point {

    private int x;
    private int y;

    public Point() {
        x = 1;
        y = 2;
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }


    public void display() {
        System.out.println("x coordinate = " + x + " y coordinate = " + y);
    }

    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
        System.out.println("x coordinate after moving = " + x + " y coordinate after moving = " + y);
    }


}
public class Runner {

    public static void main(String args[]) {

        Point p1 = new Point();
        p1.display();
        p1.movePoint(2, 3);

        Point p2 = new Point();
        p2.display();
        p2.movePoint(5, 8);


    }

}
