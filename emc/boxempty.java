public class boxempty {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++)
        { 
            int space1 = n-i;
            for(int space = 0;space<space1;space++)
            {
                System.out.print(" ");
            }
            
            for(int j = 0 ;j<i;j++)
            {
                    System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
    
}