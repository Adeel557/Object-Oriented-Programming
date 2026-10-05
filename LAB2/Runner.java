package LAB2;

class Rectangle {

    private int length, width;

    public Rectangle() {
        length = 5;
        width = 2;
    }

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void setLength(int l) //sets the value of length
    {
        length = l;
    }

    public void setWidth(int w)
    {
        width = w;
    }

    public int getLength() //gets the value of length
    {
        return length;
    }

    public int getWidth() //gets the value of width
    {
        return width;
    }

    public int area() {
        return (length * width);
    }
}

public class Runner {

    public static void main() {
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of rec1= " + rect1.area());
        Rectangle rect2= new Rectangle();
        rect2.setLength(5);
        rect2.setWidth(10);
        System.out.println("Area of Rectangle is: " + rect2.area());
                System.out.println("Width of Rectangle is: " + rect2.getWidth());
    }
}
