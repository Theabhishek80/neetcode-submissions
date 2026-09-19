class Solution {
    public int numRescueBoats(int[] people, int limit) {

          Arrays.sort(people);

        int lightest = 0;
        int haviset = people.length-1;
        int boat = 0;
        while(lightest <= haviset){
            
             
            if(people[lightest] +people[haviset]<= limit){
                haviset--;
                lightest++;
                boat++;

            }else{
                haviset--;
                boat++;
            }
        }
        return boat;
        
    }
}