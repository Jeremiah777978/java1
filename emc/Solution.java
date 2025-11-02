class Solution {
    public boolean check(int[] nums) {
        int start =0;
         int end =nums.length-1;

       while(start<end)
       {
        int temp = nums[start];
        nums[end]=nums[start];
        nums[end]=temp;
       }
       int g = nums[0];
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]>g)
        {
            return false;
        }
       }
     return true;   
}
public static void main(String[] agrs)
{
    int arr[] = {3,4,5,1,2};
    Solution obj = new Solution();
   boolean a = obj.check(arr);
   System.out.println(a);
}
}