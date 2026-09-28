package LAB2;

class Marks{
        public double mark1;
        public double mark2;
        public double mark3;

        public Marks() {
            this.mark1 = 0.0;
            this.mark2 = 0.0;
            this.mark3 = 0.0;
        }

        public Marks(double mark1, double mark2, double mark3) {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        public double calculateSum() {

            return this.mark1 + this.mark2 + this.mark3;
        }

        }

        public class MarksDisplay {
        public static void main(String[] args) {
            Marks student1 = new Marks();
            System.out.println("Student 1 Total LAB2.Marks: " + student1.calculateSum());

            Marks student2 = new Marks(85.5, 90.0, 78.5);
            System.out.println("Student 2 Total LAB2.Marks: " + student2.calculateSum());
        }

}
