import java.util.Scanner;
public class maxofarray {
    static int maximum (int arr[],int size)
    {
        int max=arr[0];
        for (int i=1;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    //used to find the second largest element of the array
    static int largest2(int arr[],int size)
    {
        int secondlargest=Integer.MIN_VALUE;
        /*
Integer.MIN_VALUE is a constant in Java that represents the minimum value that can be held by an int variable.
It has a value of -2^31, which is -2147483648.
This constant is a part of the Integer class, which is a wrapper class for the primitive data type int.
In Java, the int data type is a 32-bit signed integer, and Integer.MIN_VALUE is the smallest integer value that an int variable can hold.
         */
        int max=maximum(arr,size);
        for (int i=0;i<size;i++)
        {
            if(arr[i]>secondlargest&&arr[i]<max)
            {
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int arr[]=new int [100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        for (int i=0;i<size;++i)
        {
            arr[i]=sc.nextInt();
        }
        int max=maximum(arr,size);
        System.out.println("The largest element of the array is: "+max);
        int secondLargest=largest2(arr,size);
        System.out.println("The second largest element of the array is: "+secondLargest);
    }
}
