class Solution {
    public int[] productExceptSelf(int[] nums) {
        var value = 1;
        var oneZero = false;
        var twoZero = false;
        var zeroPos = 0;
        for (int i = 0; i < nums.length ; i++){
            if(nums[i]==0){
               if(oneZero){
                   twoZero = true;
                   break;
               }
               else{
                   oneZero = true;
                   zeroPos=i;
                   continue;
               }
            }
            value=value*nums[i];
        }
        if(twoZero){
            Arrays.fill(nums,0);
        }
        else if(oneZero){
            Arrays.fill(nums,0);
            nums[zeroPos]=value;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) continue;
                nums[i] = value / nums[i];
            }
        }
        return nums;
    }
}  
