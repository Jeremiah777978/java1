
//     public static void main(String[] agrs)
//     {   // normal try and catch block
//         try{
//             int q =0;
//             int w = 10;
//             int div = q/w;
//             System.out.println(div);
//             throw new Exception("Arthimetic Exception");
//             //  implict excetue exception we can use this form
           
//         }
//         catch(Exception e)
//         {
//          System.out.println(e);
//         }
       

//     }
    
// }
// class notvalid extends Exception{
//     notvalid(String s){
//        super(s);
//     }

    
// }
// public class Exception1
// {
//     public static void main(String[] agrs)
//     {
//         try {
//             int q = 10;
//             int a =1;
//             int sum = q/a;
//             throw new notvalid("hai");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
class clac
{
    void division () throws Exception
    {
        int a = 10/0;
    }
}
class Exception1 
{
    public static void main(String[] agrs)
    {
        clac c = new clac();
        try{
            c.division();
        }
            catch(Exception e){
                 System.out.println(e);
            }
    }
}