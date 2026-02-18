class Solution {
    public boolean hasAlternatingBits(int n) {
        
        while(n>0){
          int  currentBit = n&1;
           int nextBit = (n>>1)&1;

            if(currentBit == nextBit){
                return false;
            }
            n=n>>1;
        }
        return true;
    }
}