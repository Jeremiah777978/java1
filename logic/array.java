//   create an a Particular array element and divide them into two half
import java.util.*;
public class array {

    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int j =0;j<n;j++)
        {
            arr[j] =sc.nextInt();
        }
        int n1= sc.nextInt();
        int[] arr1 = new int[n-n1];
        for(int j =0;j<n1;j++)
        {
           arr1[j] = arr[j];
        }
         for(int j =0;j<n1;j++)
        {
           System.out.print(arr1[j]+" ");
        }
        System.out.println();
        for(int j =n1;j<n;j++)
        {
           System.out.print(arr[j]+" ");
        }
        
        
    }


    
}
