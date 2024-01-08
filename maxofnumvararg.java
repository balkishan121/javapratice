import java.util.Scanner;

public class maxofnumvararg {
    static int max(int ...num)
    {
        if (num.length==0)
            return Integer.MIN_VALUE;
      int x=num[0];
      for(int i=0;i<num.length;++i)
      {
          if (x<num[i])
          {
              x=num[i];
          }
      }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //find maximum of number using variable arguments
        System.out.println("Maximum of the number is:"+max(10,20,30,40,50,60,70,80,90));
        System.out.println("Maximum of the number is:"+max(10,20,30,40,50,60,70));
        System.out.println("Maximum of the number is:"+max(10,20,30,40,50));
    }
}
