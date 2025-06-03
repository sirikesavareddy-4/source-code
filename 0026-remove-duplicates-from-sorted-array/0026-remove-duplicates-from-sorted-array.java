class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0,j=i+1;
        // int k=0;
        // nums[k]=nums[0];
        // k++;
        // while(i<nums.length && j<nums.length)
        // {
        //     if(nums[i]==nums[j])
        //     j++;
        //     else
        //     {
        //         nums[k]=nums[j];
        //         k++;
        //         i=j;
        //         j=i+1;
        //     }
        // }
        if(nums.length==0)
        return 0;

        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[k-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}