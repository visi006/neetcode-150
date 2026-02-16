class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans-=nums[i];
            ans+=i;
        }
        ans+=n;
        return ans;
    }
}