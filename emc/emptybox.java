public class emptybox {

    public static void main(String[] agrs)
    {
        int n = 5;
        for(int row =0;row<n;row++)
        {
            for(int col =0;col<n;col++)
            {
                if(row == 0 || col == 0|| row == n-1 || col == n-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
