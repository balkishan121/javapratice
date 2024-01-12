import java.util.Scanner;

/*
write a java program to understand the data hiding concept
create a class Rectangle
properties: length, breath
methods: area perimeter
use setter and getter methods
 */
public class Hiding {

    public static class Rectangle {
        private double length;
        private double breath;

        double getLength() {
            return length;
        }

        double getBreath() {
            return breath;
        }

        void setLength(int l) {
            // Using data hiding to ensure valid input
            if (l > 0)
                length = l;
            else length = 0;
        }

        void setBreath(int b) {
            // Using data hiding to ensure valid input
            if (b > 0)
                breath = b;
            else breath = 0;
        }

        public double area() {
            return length * breath;
        }

        public double perimeter() {
            return 2 * (length + breath);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of the Rectangle class
        Rectangle r1 = new Rectangle();

        // Setting length and breadth using setter methods
        r1.setLength(10);
        r1.setBreath(20);

        // Displaying the area and perimeter
        System.out.println("Area of the rectangle is: " + r1.area());
        System.out.println("Perimeter of the rectangle is: " + r1.perimeter());

        // Close the Scanner
        sc.close();
    }
}
