/*Today I have solved  Maximum subarray 
 Link:-https://leetcode.com/problems/maximum-subarray/
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int currmax=0;
        int n=nums.length;
        int maxsofar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(currmax<0)currmax= 0;
            currmax+=nums[i];
            maxsofar=Math.max(maxsofar,currmax);
        }
        return maxsofar;
    }
}
/* Second Problem:-(Square of a sorted Array)https://leetcode.com/problems/squares-of-a-sorted-array/ */
class Solutions {
    public int[] sortedSquares(int[] nums) {
     int l=0;
     int r=nums.length-1;
     int i=nums.length-1;
     int ans[]=new int[nums.length];
     while(l<=r){
         if(Math.abs(nums[l])>Math.abs(nums[r])){
             ans[i]=nums[l]*nums[l];
             l++;

         }else{
          ans[i]=nums[r]*nums[r];
          r--;   
         }
         i--;
     }   
     return ans;
    
}
}