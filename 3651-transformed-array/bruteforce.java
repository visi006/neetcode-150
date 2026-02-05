class Solution {
    public int[] constructTransformedArray(int[] nums) {

      int n = nums.length;
      int [] ans = new int[n];

      for(int i=0;i<n;i++){
        int pos = i;
        int steps = nums[i];

        if(steps>0){
          for(int s=0;s<steps;s++){
            pos++;
          }
          if(pos==n) 
            pos=0;
        }
        else{
          for(int s=0;s<-steps;s++){
            pos--;
          }
              if (pos < 0) pos = n - 1;
                }
            }

            ans[i] = nums[pos];
        }

        return ans;
    }
}
          
