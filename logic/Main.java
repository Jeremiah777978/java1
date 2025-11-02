public class Main {
    public static void main(String[] agrs)
    {
        int a =15;
        int count =0;
        int [] arr = {10, 5, 2, 7, 1, 9};
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i;j<arr.length;i++)
            {
                count+=arr[j];
            }
            if(count == a)
            {
                System.out.println(true);
                
            }
        
        }
        System.out.println(false);
    }
}

