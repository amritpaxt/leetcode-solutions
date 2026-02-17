class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     Set<Integer>map=new HashSet<>(k);
     for(int i=0;i<nums.length;i++){
         if(i>k){
    map.remove(nums[i-k-1]);
        }

        if(!map.add(nums[i])){
            return true;
        }
       
     }

return false;

}
  
    }