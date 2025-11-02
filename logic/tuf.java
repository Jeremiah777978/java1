// // Recursion 
// class Solution {
//     public void printNumbers(int n) {
        
//         if(n==0)
//         {
//             return;
//         }
//         else
//         {
            
//             printNumbers(n-1);
//             System.out.println(n);

//         }
//     }
//     public static void main(String[] agrs)
//     {
//         Solution obj = new Solution();
//         obj.printNumbers( 5);
//     }
// }
// class Solution {
//     public void printNumbers(int n) {
    
//         if(n==0)
//         {
//             return;
//         }
//         else
//         {
//             System.out.println(n);
//             printNumbers(n-1);
           

//         }
//     }
//     public static void main(String[] agrs)
//     {
//         Solution obj = new Solution();
//         obj.printNumbers(5);
//     }
// }
// sum of the recursion
// class Recursion {
    
//     static int func(int n){
        
//             // Base Condition.
//             if(n == 0){
                
//                 return 0;
//             }
            
//             // Problem broken down into 2 parts and then combined.
//             return n + func(n-1);
            

//     }
//     public static void main(String[] args) {

//        // Here, let’s take the value of n to be 3.
//        int n = 3;
//        System.out.println(func(n));
//     }
// }
// // Recursion 
// class Solution {
//     public void printNumbers(int n) {
        
//         if(n==0)
//         {
//             return;
//         }
//         else
//         {
            
//             printNumbers(n-1);
//             System.out.println(n);

//         }
//     }
//     public static void main(String[] agrs)
//     {
//         Solution obj = new Solution();
//         obj.printNumbers( 5);
//     }
// }
// class Solution {
//     public void printNumbers(int n) {
    
//         if(n==0)
//         {
//             return;
//         }
//         else
//         {
//             System.out.println(n);
//             printNumbers(n-1);
           

//         }
//     }
//     public static void main(String[] agrs)
//     {
//         Solution obj = new Solution();
//         obj.printNumbers(5);
//     }
// }
// sum of the recursion
// class Recursion {
    
//     static int func(int n){
        
//             // Base Condition.
//             if(n == 0){
                
//                 return 0;
//             }
            
//             // Problem broken down into 2 parts and then combined.
//             return n + func(n-1);
            

//     }
//     public static void main(String[] args) {

//        // Here, let’s take the value of n to be 3.
//        int n = 3;
//        System.out.println(func(n));
//     }
// }
//  Reverse an array using recursion
// class tuf {
//     void array(int i, int n, int[] arr) {
//         if (i >= n)  // base case
//             return;

//         // swap elements
//         int temp = arr[i];
//         arr[i] = arr[n];
//         arr[n] = temp;

//         // recursive call
//         array(i + 1, n - 1, arr);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         tuf obj = new tuf();
//         obj.array(0, arr.length - 1, arr);

//         // print reversed array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
// recursive function of painldrome
// class Main {
//     int fibonacci(int a, int b, int n) {
//         if (n == 0) {
//             return a;
//         } else {
//             return fibonacci(b, a + b, n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Main obj = new Main();
//         int n = 5; // To get the 5th Fibonacci number
//         int result = obj.fibonacci(0, 1, n);
//         System.out.println("Fibonacci number at position " + n + " is: " + result);
//     }
// }
// hashing  of character and count elemnt of string
// public class CharCount {
//     public static void main(String[] args) {
//         String s = "a,bcdefa";  

//         int[] hash = new int[256]; // supports ASCII characters

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             hash[ch]++;   // implicit hashing (char → ASCII → index)
//         }

//         // Print frequency of each character
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println((char)i + " occurs " + hash[i] + " times");
//             }
//         }
//     }
// }
// string using hasing;
// import java.util.*;

// class tUf {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s;
//         s = sc.next();

//         //precompute:
//         int[] hash = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//             hash[s.charAt(i) - 'a']++;
//         }

//         int q;
//         q = sc.nextInt();
//         while (q-- > 0) {
//             char c;
//             c = sc.next().charAt(0);
//             // fetch:
//             System.out.println(hash[c - 'a']);
//         }
//     }
// }
//when  ever we are doing hasing we should make pre caluclation and make the maximum lemnt of array as the length of hash lenght
// import java.util.*;
// class Main
// {
//     public static void main(String [] agrs)
//     {
//         int[] arr = {5,5,5,5,5};
//         int max=0;
//         for(int x: arr)
//         {
//             max = Math.max(max,x);
//         }
//         int hash[] = new int[max+1];
//         for(int i=0;i<arr.length;i++)
//         {
//             hash[arr[i]]+=1;
//         }
//         for(int i=0;i<hash.length;i++)
//         {
//             if(hash[i]!=0)
//             {
//                 System.out.println(i+" "+hash[i]);
//             }
//         }
//     }
// }
// selection sort
// class main
// {
//     public static void main(String[] agrs)
//     {
//         int arr[] ={13,9,24,52,20,9};
//         for(int i=0;i<arr.length-1;i++)
//         {
//             int min= i;
//             for(int j=i;j<arr.length;j++)
//             {
//                 if(arr[j]<arr[min])
//                 {
//                 min=j;
//                 }
//             }
//             int temp = arr[min];
//                     arr[min]=arr[i];
//                     arr[i]=temp;
//         }
//          for(int i=0;i<arr.length;i++)
//          {
//              System.out.print(arr[i]+" ");
//          }
//     }
// }
//merge sort
// import java.util.*;

// class Main {
//     void merge(int[] arr, int low, int high) {
//         if (low >= high) {
//             return;
//         }
//         int mid = (low + high) / 2;

//         // Divide into two halves
//         merge(arr, low, mid);
//         merge(arr, mid + 1, high);

//         // Merge two sorted halves
//         merge_sort(arr, low, mid, high);
//     }

//     private static void merge_sort(int[] arr, int low, int mid, int high) {
//         int left = low;
//         int right = mid + 1;
//         ArrayList<Integer> temp = new ArrayList<>();

//         // Merge elements into temp
//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // Add remaining left side
//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         // Add remaining right side
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // Copy temp back to arr
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 5, 6, 7, 9, 1, 2, 3, 4};
//         Main obj = new Main();
//         obj.merge(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }
// }
//largest element in an array
// class tuf
// {
//     public static void main(String[] args) {
//         int [] arr ={2,3,4,1,2};
//         int max = arr[0];
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]>max)
//             {
//                 max = arr[i];
//             }
//         }
//     }
// }
// smallest element of array
//import java.util.*;
//class tuf
// {
//     public static void main(String[] args) {
//         int [] arr ={2,3,4,1,2};
//         int min = arr[0];
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<min)
//             {
//                 max = arr[i];
//             }
//         }
//     }
// }
//Second largest element in an array
// linear Search
// import java.util.*;
// class main
// {
//     public static void main(String[] agrs)
//     {
//         int a = 6;
//          int arr[] = {1,2,3,4,5,6};
//          boolean b=false;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(a==arr[i])
//            {
//                b = true;
//            }
//        }
//        if(b==true)
//        {
//            System.out.println("found");
//        }
//        else
//        {
//            System.out.println("not found");
//        }
//     }
// }
// qs(0,7) → pivot=4 → [1,3,2,4,7,9,5,6]
//    ├─ qs(0,2) → pivot=1 → [1,3,2]
//    │     ├─ qs(0,-1) stop
//    │     └─ qs(1,2) → pivot=3 → [1,2,3]
//    │           ├─ qs(1,1) stop
//    │           └─ qs(3,2) stop
//    └─ qs(4,7) → pivot=7 → [5,6,7,9]
//          ├─ qs(4,5) → pivot=5 → [5,6]
//          │     ├─ qs(4,3) stop
//          │     └─ qs(5,5) stop
//          └─ qs(7,7) stop
// import java.util.*;

// class Main {
//     // Partition function
//     private static int partition(List<Integer> arr, int low, int high) {
//         int pivot = arr.get(low);
//         int i = low;
//         int j = high;

//         while (i < j) {
//             while (arr.get(i) <= pivot && i <= high - 1) {
//                 i++;
//             }
//             while (arr.get(j) > pivot && j >= low + 1) {
//                 j--;
//             }
//             if (i < j) {
//                 // swap arr[i] and arr[j]
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(j));
//                 arr.set(j, temp);
//             }
//         }
//         // swap pivot with arr[j]
//         int temp = arr.get(low);
//         arr.set(low, arr.get(j));
//         arr.set(j, temp);

//         return j;
//     }

//     // QuickSort recursive function
//     private static void qs(List<Integer> arr, int low, int high) {
//         if (low < high) {
//             int partitionIndex = partition(arr, low, high);
//             qs(arr, low, partitionIndex - 1);
//             qs(arr, partitionIndex + 1, high);
//         }
//     }

//     // Public quicksort function
//     static List<Integer> quicksort(List<Integer> arr) {
//         qs(arr, 0, arr.size() - 1);
//         return arr;
//     }

//     // Main function
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9));

//         System.out.println("Before sorting: " + list);
//         quicksort(list);
//         System.out.println("After sorting: " + list);
//     }
// }
// Array of 90 degree rotation
// import java.util.*;
// class Main
// {
//     public static void  main(String[] agrs)
//     {
//         int[][] arr= { {1,2,3},{4,5,6},{7,8,9}};
//         System.out.println(Arrays.deepToString(arr));
//         int n = arr.length;
//         for(int i=0;i<arr.length/2;i++)
//         {
//             for(int j =0;j<n-i-1;j++)
//             {
//                 int temp = arr[i][j];
//                 // int temp1 = arr[n-i-1][j];
//                 // int temp2 = arr[n-i-1][n-j-1];
//                 // int temp3 = arr[i][n-j-1];
//                 arr[i][j] = arr[n-j-1][i];
//                 arr[n-j-1][i] = arr[n-i-1][n-j-1];
//                 arr[n-i-1][n-j-1] = arr[j][n-i-1];
//                 arr[j][n-i-1] = temp;
                
//             }
//         }
//         System.out.println(Arrays.deepToString(arr));
//     }
// }
// still try and error
// import java.util.*;
// class Main
// {
//     public static void main(String[] agrs)
//     {
//         int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
//         List<Integer> list = new ArrayList<>();
//         int a =0;
//         int n= arr.length;
//         int [][] arr1  = new int [3][3];
//         for(int i=0;i<arr.length;i++)
//         {
            
//             for(int j =0;j<arr.length;j++)
//             {
                
//                 if(i+j==a)
//                 {
//                     list.add(arr[i][j]);
//                     ++a;
//                 }
              
//             }
           
//         }
//         int a1=3;
//         for(int i=arr.length-1;i>=n/2;i--)
//         {
//             for(int j =arr.length-1;j>0;j--)
//             {
//                 if(i+j==a1)
//                 {
//                 list.add(arr[i][j]);
                
//                 }
//               a--;
//             }
//         }
//         System.out.println(list);
//     }
// }
// import java.util.*;
// class Main
// {
//     public static void main(String[] agrs)
//     {
//         int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12} };
//         List<Integer> list = new ArrayList<>();
//         List<Integer> list1 = new ArrayList<>();
//         int a =0;
//         int n= arr.length-2 ;
//         int n1=arr[0].length-2;
//         for(int i=0;i<arr.length;i++)
//         {
            
//             for(int j =0;j<arr[0].length;j++)
//             {
                
//                 if(i+j==a)
//                 {
//                     list.add(arr[i][j]);
//                     ++a;
//                 }
               
              
//             }
           
//         }
     
// for (int j = arr[0].length - 2; j >= 0; j--) {
//     list1.add(arr[arr.length - 1][j]);
// }
// for (int i = arr.length - 2; i > 0; i--) {
//     list1.add(arr[i][0]);
// }


//       //Collections.reverse(list1);
//       list.addAll(list1);
//        list.add(arr[n][n1]);
//         System.out.println(list);
//         //[1,2,3,4,8,12,11,10,9,5,6,7]
//     }
// }
// give the postive subarray
// public class Main {
//     count ing how many subarray or there
// import java.util.*;
// class Main
// {
//     public static void main(String[] agrs)
//     {
//         int[] arr ={1,2,3,4,5};
//         int k = 3;
        // int sum=0;
        // int count=0;
        // int rem=0;
        // Map <Integer,Integer> map1 = new HashMap<>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum+=arr[i];
        //     if(sum==k)
        //     {
        //         ++count;
        //         }
        //         rem = sum-k;
        //         if(map1.containsKey(rem))
        //         {
        //             ++count;
        //         }
        //         map1.put(sum,i);
        // }
//         System.out.println(count);
//     }
// }
// maximum subarray is equal to 0;
// import java.util.*;
// class Main
// {
//     public static void main(String[] agrs)
//     {
   
//         int[] arr = { 1, 2, -3, 3, -1, -2, 4};
//         Set <Integer> map = new HashSet<>();
//         Arrays.sort(arr);
//         int count =0;
//         int sum = 0;
//          int sum1 = arr[1];
        
//         for(int i = 0;i<arr.length;i++)
//         {
//             sum +=arr[i];
//             ++count;
//             if(sum == 0)
//             {
//                 map.add(count);
//                 count=0;
//             }
            
//         }
//         for(int f : map)
//         {
//             System.out.println(f);
//         }
//     }
// }
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//        String s ="1 2 3 0 0 0";
//        int s1  =3;
//        String sh = "2 5 6";
//        int s2 = 3;
//        List<Integer> l1 = new ArrayList<>();
//        List<Integer> l2 = new ArrayList<>();
//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)== ' ')
//            {
//                continue;
//            }
//            int a = s.charAt(i)-'0';
//            l1.add(a);
//        }
//        for(int i=0;i<sh.length();i++)
//        {
//            if(sh.charAt(i)== ' ')
//            {
//                continue;
//            }
//            int a = sh.charAt(i)-'0';
//             l2.add(a);
//        }
       
//        int [] arr = new int[s1+s2];
//        for( int i = 0;i<arr.length;i++)
//        {
//            if(i<3)
//            {
//                arr[i] = l1.get(i);
//            }
//            else
//            {
//                arr[i] = l2.get(i-s2);
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
       
//     }
// }
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//        String s ="1";
//        int s1  =0;
//        String sh = "";
//        int s2 = 1;
//        List<Integer> l1 = new ArrayList<>();
//        List<Integer> l2 = new ArrayList<>();
//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)== ' ')
//            {
//                continue;
//            }
//            int a = s.charAt(i)-'0';
//            l1.add(a);
//        }
//        for(int i=0;i<sh.length();i++)
//        {
//            if(sh.charAt(i)== ' ')
//            {
//                continue;
//            }
//            int a = sh.charAt(i)-'0';
//             l2.add(a);
//        }
       
//        int [] arr = new int[s1+s2];
//        for( int i = 0;i<arr.length;i++)
//        {
//            if(i<3)
//            {
//                arr[i] = l1.get(i);
//            }
//            else
//            {
//                arr[i] = l2.get(i-s2);
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
       
//     }
// }
//kola eating banana
// // cclass Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         long a =0;
//         int b =0;

//         int max = Arrays.stream(piles).max().getAsInt();
//         for( int i = 1;i<=max;i++)
//         {
//             a=0;
//             for( int j = 0;j<piles.length;j++)
//             {
//                a +=Math.ceil((double)piles[j] / i);
//             }
//             if(a<=h)
//             {
//                return i;
//             }
            
//         }
//        return 0; 
//     }
// give distinct character  in abac output;
// class Solution {
//     public int beautySum(String s, int k) {
//         if(s.length()==0)
//         {
//             return 0;
//         }
//    return atmost(s ,k)-atmost(s ,k-1);
//     }
//     public int atmost(String s,int k)
//     {
//         int i =0;
//         int j= 0;
//         int[] m = new int[26];
//         int ans =0;
//         int count=0;
//         while(j<s.length())
//         {
//         m[s.charAt(j)-'a']++;
//          if(m[s.charAt(j)-'a']==1)  
//          {
//             count++;
//          } 
//          while(count>k) {
//           m[s.charAt(i)-'a']--;
//           if(m[s.charAt(i)-'a']==0)
//           {
//             count--;
//           }
//           i++;
//          }
//          ans += j-i+1;
//          j++;
//         }
//       return ans;
//     }
// }
// class Solution {
//     public static int max1(int i,int j,int[] freq,String s)
//     {
//         int max = 0;
//         for( int k=i;k<=j;k++)
//         {
//             freq[s.charAt(k)-'a']++;
//             if(max<freq[s.charAt(k)-'a'])
//             {
//                 max =freq[s.charAt(k)-'a']; 
//             }
//         }
//         return max;
//     }
//     public static int min1(int i,int j,int[] freq,String s)
//     {
//         int min =Integer.MAX_VALUE;
//         for( int k=i;k<=j;k++)
//         {
//             if(min>freq[s.charAt(k)-'a']&&freq[s.charAt(k)-'a']!=0 )
//             {
//                 min=freq[s.charAt(k)-'a']; 
//             }
//         }
//         return min;
//     }
//     public int beautySum(String s) {
//         int sum =0;
//        for(int i=0;i<s.length();i++)
//     {
//            for( int j=i;j<s.length();j++)
//            {
//             int[] m = new int[26];
//             int max = Solution.max1(i,j,m,s);
//               int min = Solution.min1(i,j,m,s);
//               if(max >min){
//               sum = sum+max-min;
//               }
//            }
//        }
//        return sum;
//     }
// }
