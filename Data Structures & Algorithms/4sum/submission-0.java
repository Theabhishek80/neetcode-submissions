class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i<nums.length-3; i++){
            if(i>0 && nums[i]== nums[i-1]){
                continue; 
            }
            
            for(int j = i+1; j<nums.length-2; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) {
            continue;
        }
         
            
            int k = j+1; 
            int e = nums.length -1; 
            while(k<e){
                long sum =  (long) nums[i]+nums[j]+nums[k]+nums[e];

                // fist condition if sum is eqal to target 

                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k],nums[e]));
                    k++;
                    e--;
                  // now we need skip the duplicate from both end from k and e 

                  while(k<e  && nums[k]== nums[k-1]){
                    k++;
                  }
                  while (k<e &&  nums[e] == nums[e+1] ){
                    e--;
                  }
                 
                 }
                 else if (sum <target){
                    k++;
                  }
                  else {
                    e--;
                  }

            }



            }
        }
        return result;
        
        
    }
}