import java.util.Scanner;
class Rectangle{
    public int length;
    public int width;

    public int area(){
        return (length*width);
    }

    public int perimeter(){
        return 2*(length+width);
    }
    public void display(){
        System.out.println("Area of rectangle is: " + area() + "\nPerimeter of rectangle is: "+ perimeter());
    }

}

public class Main {
    public static void main(String[] args){
        Rectangle r= new Rectangle();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length: ");
        r.length= sc.nextInt();
        System.out.print("Enter the width: ");
        r.width= sc.nextInt();
        r.display();
    }
}