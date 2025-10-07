Brute force approach

 public class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

Hashing set approach ( most optimal one)  this is mostly useed in all cases and has an efficieny of around 88% accepting

public class Solution {
    public boolean hasDuplicate(int[] nums) {   // same as brute force
        Set<Integer> seen = new HashSet<>();    // used to create new hash set
        for (int num : nums) {      // enhanced for loop will cover all elements of nums in numm that is a hashset.
            if (seen.contains(num)) {  //Checks if the current number `num` **already exists** in the `seen` set.
                return true;
            }
            seen.add(num);       //If num was not already in seen, we add it to the set.
        }
        return false;
    }
}
