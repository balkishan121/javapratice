import java.util.Scanner;
public class sumofelementusingvararg {
    static int sum(int...num)
    {
        int sum=0;
        if (num.length==0)
            return Integer.MIN_VALUE;
        for(int i=0;i<num.length;++i)
        {
            sum+=num[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The sum of all the element is: "+sum(10,20,30,40,50,60));
         System.out.println("Maximum of the number is:"+sum(10,20,30,40,50,60,70,80,90));
        System.out.println("maxmimum of the number is:"+sum(10,20,30,40,50,60,70));
        System.out.println("Maximum of the number is:"+sum(10,20,30,40,50));
    }
}
