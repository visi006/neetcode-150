class Solution {
    public int longestBalanced(int[] nums) {
        
        int result = 0; // for storing the final result used in returning the function
        for(int i=0;i<nums.length;i++){  // just looping through the subarray accessing all the elements

        HashSet<Integer> odd = new HashSet<>();  // create a hashset for odd numbers 
        HashSet<Integer> even = new HashSet<>(); // create a hashset for even numbers

        for(int j=i;j<nums.length;j++){ // consider j as initial position of subarray
            if((nums[j]%2 == 0)){ // checking even number condition
                even.add(nums[j]); // add to array if satisfied even
            }
            else {
                odd.add(nums[j]);  // add to array if satisified odd
            }
            if(odd.size() == even.size()){ // conditon to check if size of odd and even is same
                result = Math.max(result,j-i+1);  // store the max value of the result in the result variable.
            }
        }
        }
        return result; // return the result value which is stored from  the first.
        
    }
}
