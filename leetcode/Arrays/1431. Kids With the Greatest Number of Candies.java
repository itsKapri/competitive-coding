class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool=new ArrayList<Boolean>();
        int n=candies.length;
        for(int i=0;i<n;i++){
            int sum=candies[i]+extraCandies;
            boolean r=true;
            for(int j=0;j<n;j++){
                if(sum<candies[j]){
                    r=false;
                    break;
                     }
            }
        if(r){
            bool.add(true);
        }
        else{
            bool.add(false);
        }
        }
            return bool;
    }
}