import java.util.Scanner;

/*
write a java program to under the classes and objects concept
create a class rectangle
properties: length, breath
methods: area perimeter
 */
    public class rectangle{
        public double length;
        public double breath;
       public double area(double length,double breath)
        {
            return length*breath;
        }
       public double perimeter (double length, double breath)
        {
            return 2*(length+breath);
        }
        public static class circle{
           public double radius;
           public double area (double radius)
           {
               return Math.PI*radius;
           }
        }
            /*
           in order to call any method from the public static void main method we have to make the static as well
            */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //creating object of the rectangle class
        rectangle r1=new rectangle();
        System.out.println("Enter the length and breath of rectangle");
        r1.length=sc.nextDouble();
        r1.breath=sc.nextDouble(); 
        System.out.println("area of the rectangle is:"+r1.area(r1.length,r1.breath));
        //dealing with circle class
        circle r=new circle();
        System.out.println("Enter the radius of circle");
        r.radius=sc.nextDouble();
        circle r2=new circle();
        System.out.printf("The area of the circle is:"+r.area(r.radius));

    }
}
