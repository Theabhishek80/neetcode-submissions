class Solution {
    public int search(int[] nums, int target) {

        int start = 0 ;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // if target exist in mid then retrun the mid
            if(target==nums[mid]) return mid;

            // now see the which side of array is sorted 

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target <=  nums[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            else {
                if(nums[mid]<= target && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
        
    }
}
