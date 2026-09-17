class Solution {
    public void rotate(int[] nums, int k) {
        int start;
        int end = nums.length-1;
        for(start=0; start<end; start++){
            int temp =nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            end--;

 }
k = k % nums.length;

int start1;
int end1 = k-1;


         for(start1=0; start1<end1; start1++){
               int temp =nums[start1];
            nums[start1] = nums[end1];
            nums[end1] = temp ;
            end1--;
            }


            int start2 ;
            int end2 = nums.length-1;

            for(start2=k; start2<end2; start2++){
                int temp = nums[start2];
                nums[start2] = nums[end2];
                nums[end2] = temp;
                end2--;
            }




        
    }
}