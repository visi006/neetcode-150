class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);

        int n = piles.length;
        int total = 0;
        int start = 0;
        int end = n-1;

        while(start<end){

            end--;
            total+= piles[end];
            end--;
            start++;
        }
        return total;
    }
}