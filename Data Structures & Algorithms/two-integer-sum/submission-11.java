class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>result= new HashMap<>();

     for(int i =0; i<nums.length; i++){
        int needed = target-nums[i];
        if(result.containsKey(needed)){
            return new int []{result.get(needed),i};
        }
        result.put(nums[i],i);
     }
     return new int [] {-1,-1};

      

    }
}
