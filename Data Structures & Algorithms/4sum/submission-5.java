class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Arrays.sort(nums);

         List<List<Integer>> result = new ArrayList<>();

         int n = nums.length;

         for(int i = 0; i<n-3; i++){             // in this line n-3 not clear 
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j = i+1; j<n-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;

                }

              int k = j+1;
              int e = n-1;

              while(k<e){
                long sum = (long)  nums[i] + nums[j] +nums[k] +nums[e] ;

            if(sum==target){
                 result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[e]));
                 

                        while (k < e && nums[k] == nums[k + 1]) {
                            k++;
                        }
                while(k<e && nums[e] == nums[e-1]){
                    e--;
                }

                k++;
                e--;
            }
            else if(sum<target){
                k++;
            }else{
                e--;
            }
              }


            }

        
         }

            return result;
        
    }
}
