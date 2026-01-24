class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int maxPairSum = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            maxPairSum = Math.max(maxPairSum, nums[left] + nums[right]);
            left++;
            right--;
        }
        return maxPairSum;
    }
}
