
// // class leetcode {

// //     public int reverse(int x) {
// //         int rev = 0;
        
// //         while (x != 0) {
// //             int num = x % 10;
// //              rev = rev * 10 + num;
// //             if (
// //                 rev > Integer.MAX_VALUE / 10 ||
// //                 (rev == Integer.MAX_VALUE / 10 && num > 7)
// //             ) return 0;
// //             if (
// //                 rev < Integer.MIN_VALUE / 10 ||
// //                 (rev == Integer.MIN_VALUE / 10 && num< -8)
// //             ) return 0;
           
// //             x = x / 10;
// //         }
        
// //             return rev;
        
        
        
// //     }



// //     public static void main(String[] args) {
// //         leetcode obj = new leetcode();
// //         int a=obj.reverse(1534236469);
// //         System.out.println(a);
// //     }
// // }
// // Pailndorme in java
// // class Solution {
// //     public boolean isPalindrome(int x) {
// //         int rev =0;
// //         int sum = x;
// //         while(x>0)
// //         {
// //             int num = x%10;
// //             rev = rev*10+num;
// //             x =x/10;
// //         }
// //         return sum==rev;

        
// //     }
// // }
// // check wether Prime or not
//  public boolean isPrime(int n) {
//         int count = 0;
//           for(int i =2;i<n;i++)
//           {
//             if(n%i==0)
//             {
//                return false;
//             }
//           }
//           return true;
//         //   if(count==0)
//         //   {
//         //     return true;
//         //   }
//         //   else
//         //   {
//         //     return false;
//         //   }
//     }
//     public static void main(String[] agrs)
//     {
//         Solution obj = new Solution();
//         boolean a=obj.isPrime(3);
//         System.out.println(a);
        
        
//     }
// }
// fibonaci
// class leetcode{
//     public static void main(String[] args) {
//         int a=0;
//         int b=1;
//         int c=0;
//         int n=6;
//         for(int i=1;i<n;i++)
//         {
           
//             c= a+b;
//             a=b;
//             b=c;

//         }
//         System.out.println(c);
//     }
// }
// pailndrome my approach
// class leetcode
// {
//     public static void main(String[] agrs)
//     {
//         String a = "jeremiah:anton";
//         a.toLowerCase().trim();
//         StringBuilder b = new StringBuilder() ;
//         for(int i =a.length();i>0;i--)
//         {
//             char a1 = a.charAt(i);
//             b = b.append(a1);
//         }
//         System.out.println(b.toString());
//     }
// }
//  Amstrong
// class Solution {
//     public boolean isArmstrong(int n) {
//         int n2 = n;
//         int reverse =0;
//         while(n>0)
//         {
//         int num1 = n%10;
//          reverse  = reverse+num1*num1*num1;
//         n=n/10;
//         }
//         if(reverse==n2)
//         {
//             return true;
//         }
//             else
//             {
//                 return false;
//             }
//     }
// }
// Euladrian algorithm
// formula = min(a,b) = min(a-b,b)
// Srting pailndrome
// import java.io.*;
// import java.util.Arrays;
// class Test {
//   static private boolean isPalindrome(String s) {
//     int left = 0, right = s.length()-1;
//         while(left<right)
//         {
//             char l = s.charAt(left), r = s.charAt(right);
//             if(!Character.isLetterOrDigit(l)) 
//                 left++;
//             else if(!Character.isLetterOrDigit(r)) 
//                 right--;
//             else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
//                 return false;
//             else {
//                 left++; 
//                 right--;
//             }
//         }
//         return true;
//   }
//   public static void main(String[] args) {
//     String str = "ABCDCBA";
//     boolean ans = isPalindrome(str);

//     if (ans == true) {
//       System.out.println("Palindrome");
//     } else {
//       System.out.println("Not Palindrome");
//     }
//   }
// }
// using recursion of pailndrome
// class Recursion {
    
//     static boolean palindrome(int i, String s){
        
//             // Base Condition
//             // If i exceeds half of the string, means all the elements 
//             // are compared, we return true.
//             if(i>=s.length()/2) return true;
            
//             // If start is not equal to end, not palindrome.
//             if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
//             // If both characters are same, increment i and check start+1 and end-1.
//             return palindrome(i+1,s);
            

//     }
//     public static void main(String[] args) {

//        // Example string.
//        String s = "madam";
//        System.out.println(palindrome(0,s));
//     }
// }
// find the value of duplicating array
// class Solution {
//     public int removeDuplicates(int[] arr) {
       
//         int count=0;
//         int n = arr.length-1;
//         int [] arr1= new int[arr.length];
//         for(int i=0;i<arr.length;i++)
//         {  
//             count =0;
//             for(int j=i+1;j<arr.length;j++)
//             {
//             if(arr[i]==arr[j])
//             {
//                 count++;
//                 if(count>=1)
//                 {
//                     arr[j]=Integer.MIN_VALUE;
//                 }
//             }
//         }
//         }
//         int k=0;
//         for(int i=0;i<arr.length;i++)
//         {  
//             if(arr[i]==Integer.MIN_VALUE)
//             {
//                 continue;
//             }
//             arr1[k]=arr[i];
        
//              k++;
        
        
//         }
//         for (int i = 0; i < k; i++) {
//             arr[i]=arr1[i];
           
//         }

//         return k; 
      
        
//     }
// }