package emc;
import java.util.*;
public class file1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        // IF CONDITION IN JAVA
        float a = 10f;
       long a1 = 100000;
        if(a<10)
        {
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
        //FOR CONDITION
        for(int i =0;i<10;i++)
        {
                System.out.println("i");

        }
        //ARRAY USING FOR LOOP
        int[] a2 = new int[10];
        for(int n:a2)
        {
            System.out.println(n);
        }
        //  while Loop
        int n1 =0;
         while(n1>10) 
         {
            System.out.println(n1);
            n1++;

         }
    //    do whileloop
    int i=0;
     do{
        i++;
        System.out.println(i);
     }
     while(i>10);
//  Switch Case
         Scanner scan = new Scanner(System.in);
         int w = scan.nextInt();
         switch (w) {
             case 1:
                     System.out.println("one");
                 
                 break;
                 case 2:
                   System.out.println("two");
                   break;
             default:
                 System.out.println("Invalid");
         }
        //  switch case
        switch(w)
        {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.err.println("error");
        }
    } 
}
