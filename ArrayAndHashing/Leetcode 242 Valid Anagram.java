the problem is being solved using HashTable using Array method
    

class Solution { //creates a class first as per leetcode standard
     public boolean isAnagram(String s, String t) {  
        if(s.length()!=t.length()){   //Check lengths first: If the strings are not of the same length, they can't be anagrams.  Otherwise return false.
            return false;
        }
        int [] count = new int[26];  //Create an array count of size 26 to represent frequency of letters a–z. as we are assuming only lower case chararacter.
        for(int i=0;i<s.length();i++){ // start a loop thst iterates through each character in string s and t.
            count[s.charAt(i) - 'a']++;  // Increase the count for the character in s.
            count[t.charAt(i) - 'a']--;  // decrease the count for the character in t.
        }
        for(int val:count){  //Now check if all values in the count array are zero.
            if(val!= 0){     // if they are not zero then return false.
                return false;
            }
        }

            return true;  // else return true last option. if all the characters in anagaram are matched by their frequncy.
    }
    }
    


