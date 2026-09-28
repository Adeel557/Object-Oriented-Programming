package LAB2;

class Distance {
    public double feet;
    public double inches;

    public Distance() {
        feet = 2.5;
        inches = 5;
    }

    public Distance(double f, double i) {
        feet = f;
        inches = i;
    }

    public void display() {
        System.out.println("Feet: " + feet + "\nInches: " + inches);
    }
}


public class DistanceDisplay {
        public static void main(String[] args){
            Distance d1 = new Distance();
            d1.display();
            Distance d2= new Distance(4.0, 10);
            d2.display();
    }
}
