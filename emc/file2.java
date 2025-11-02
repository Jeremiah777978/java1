 class animal
 {
   int n =10;
   void hello()
   { 

      System.out.println("kelo jeremiah");

   }
 }
 class gifrafev extends animal
 {
   void hello()
   { super.hello();
      System.out.println(super.n);
   }
 }
 class a{ 
   void f2()
   {
      System.out.println("hello jeremiah");
   }
}
//  single inhertiance in java
 class b extends a{ 
   void fi2()
   {
      System.out.println("hello jeremiah");
   }
 
 }
 interface  s{
  void message();
   
 }
class s1 implements s{
  public void message()
   {
           System.out.println("hello java");
   }
}
public class file2 {
    //  example using this keyword
    int num1=0;
    //  functions in Java
     void menu()
     {
        System.out.println("kello india");

     }
     void hi(int n)
     {
        this.num1 = n;
        System .out.println(num1);
     }
     void hi(float n)
     {
        
        System .out.println(n);
     }
     interface an{
      void message1();

     }
    public static void main(String[] args) {
        System.out.println("hai everyone");
        file2 f = new file2();
        f.menu(); 
        //  example method overloading
        //  due to the argument makes tus different
        f.hi(10);
        f.hi((float) 10.92);
        // METHOD OVERRIDING
         //due to the same class will be in different class
            gifrafev g =  new gifrafev();
            g.hello();
            // USING INHERTIANCE
            b  v = new b();
            v.fi2();
            v.f2();
            // MULTIPLE IT NOT WILL USED IN JAVA WE CAN USE IN THE FORM OF IMPLEMENTS
            s1 d = new s1();
            d.message();
           // LAMBDA FUNCTION
           an obj = new an(){
            public void message1()
            {
               System.out.println("bye");
            }
           };
          obj.message1();
         }
}
