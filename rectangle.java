import java.lang.management.MemoryType;
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

        //**************circle class*********************
        public static class circle{
           public double radius;
           public double area (double radius)
           {
               return Math.PI*radius;
           }
        }
        //*******************cylinder clas***********************
    public static class cylinder{
                public double radius;
                public double height;
                public double areaofcircle(double radius)
                {
                    return Math.PI*radius*radius;
                }
                public double sidesurfacearea(double radius,double height)
                {
                    return 2*Math.PI*radius*height;
                }
                public double surfacearea(double radius,double height)
                {
                    return areaofcircle(radius)+sidesurfacearea(radius,height);
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



        //dealing with cylinder class
        cylinder c=new cylinder();
        System.out.printf("\nEnter the radius and height of the cylinder:\n");
        c.radius=sc.nextDouble();
        c.height=sc.nextDouble();
        System.out.println("area of circle of cylinder is: "+c.areaofcircle(c.radius)+
                "\narea of side surface is: "+c.sidesurfacearea(c.radius,c.height)+
                "\nSurface area of the circle is: "+c.surfacearea(c.radius,c.height));
    }
}
