import java.util.Scanner;
public class areaofshapes {
    //To find the area of square
    static void area(int length)
    {
        System.out.println("Area of the square is: "+(length*length));
    }
    //// to find the area of rectangle
    static void area(int length, int breath)
    {
        System.out.println("Area of the rectangle is: "+(length*breath));
    }
    // to find the area of circle
    static void area(float radius)
    {
        System.out.println("Area of the rectangle is: "+(3.14*radius*radius));
    }

    public static void main(String[] args) {
        //we have to find area of square rectangle and circle using method over loading
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for area finding the area of square");
        System.out.println("Press 2 for area finding the area of rectangle");
        System.out.println("Press 3 for area finding the area of circle");
        int choise =sc.nextInt();
        if(choise==1)
        {
            System.out.println("Enter the length of square:");
            int length=sc.nextInt();
            area(length);
        } else if (choise==2) {
            System.out.println("Enter the length and breath of rectangle:");
            int length= sc.nextInt();
            int breath =sc.nextInt();
            area(length,breath);
        } else if (choise==3) {
            System.out.println("Enter the radius of circle:");
            float radius=sc.nextFloat();
            area(radius);
        }

    }
}
