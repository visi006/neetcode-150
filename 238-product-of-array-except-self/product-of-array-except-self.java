class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Prefix products
        // result[i] will contain product of all elements to the LEFT of i

        int prefix = 1;
        for(int i=0;i<n;i++){
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

           // Step 2: Suffix products
        // Multiply product of all elements to the RIGHT of i

        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }
}
