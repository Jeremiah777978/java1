// public class diamond {
//     public static void main(String[] agrs)
//     {
//         int n=5;
//         for(int row = 1;row<2*n+1;row++)
//         {
//                int colum = row>n?2*n-row:row;
//                int space1 = 2*n-row+row;
//             //   for(int space = 0;space<space1;space1++)
//             //   {
//             //       System.out.print("");
//             //   }
               
//              for(int col = 0;col<;col++)
//              {
//                   System.out.print("*");
//              }
//              System.out.println("");

//         }
//     }
    
// }
// class Main {
//     public static void main(String[] args) {
//         int n=5;
//          for(int row=0;row<n;row++)
//          {
//              for(int j =0;j<row;j++)
//              {
//                  System.out.print(" ");
//              }
//               for(int j =0;j<2*n-(2*row+1);j++)
//              {
//                  System.out.print("*");
//              }
//              for(int j =0;j<row;j++)
//              {
//                  System.out.print(" ");
//              }
//              System.out.println();
//          }
//     }
// }
// *********
//  ******* 
//   *****  
//    ***   
//     *    
// class Main {
//     public static void main(String[] args) {
//         char a = 'a';
//         int i = (int)a;
//         ++i;
//         for(int row=0;row<5;row++)
//         {
//             for(int col=0;col<=row;col++)
//             {
//                 System.out.print(a);
                
//             }
//              a = (char) i;
//                 i++;
        
//             System.out.println();
//         }
//     }
// }
// a
// bb
// ccc
// dddd
// eeeee
// class diamond {
//     public static void main(String[] args) {
//         int n = 5;
        
//         for (int row = 0; row < n; row++) {
//             // Print spaces
//             for (int j = 0; j < n - row - 1; j++) {
//                 System.out.print(" ");
//             }

//             char a = 'A'; // Reset to 'A' for each row
//             int breakpoint = 2 * row;

//             // Print characters
//             for (int j = 0; j <= breakpoint; j++) {
//                 System.out.print(a);
//                 if (j < breakpoint / 2) {
//                     a++;
//                 } else {
//                     a--;
//                 }
//             }

//             System.out.println(); // Move to next line
//         }
//     }
// }
// class diamond {
//     public static void main(String[] args) {
//         int n=5;
//         char a ;
        
//          for(int row=0;row<n;row++)
//          {
//              for(int j = 0;j<n-row-1;j++)
//              {
//                  System.out.print("  ");
//              }
//             a = 'E';
//               for(int j = 0;j<=row;j++)
//              {
                
//                  System.out.print(a);
//                  a --;
                
//              }
//               for(int j = row-n;j>0;j--)
//              {
//                  System.out.print("  ");
//              }
//              System.out.println();
//          }
//     }
// }
// class diamond
// {
// public static void main(String[] agrs)
// {
//     int size = 2;
//       for(int row=0;row<5;row++)
//       {
//           for(int col=0;col<row;col++)
//           {
//               System.out.print("*");
//           }
//           for(int col=0;col<2*5-size;col++)
//           {
//               System.out.print(" ");
//           }
//           for(int col=row;col>0;col--)
//           {
//               System.out.print("*");
//           }
//           size+=2;
//           System.out.println();
//    } 
//    size = 2;
//    for(int row=3;row>0;row--)
//       {
//           for(int col=0;col<row;col++)
//           {
//               System.out.print("*");
//           }
//           for(int col=0;col<size;col++)
//           {
//               System.out.print(" ");
//           }
          
//            for(int col=0;col<row;col++)
//           {
//               System.out.print("*");
//           }
//           size+=2;
//           System.out.println();
//    }   
//    }
   
// }
// OUTPUT
// ****
// *  *
// *  *
// ****

