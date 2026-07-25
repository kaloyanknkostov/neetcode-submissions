class Solution {
    public int[] twoSum(int[] nums, int target) {
           var map = new HashMap<Integer,Integer>();
        int num;
        for (int i = 0; i < nums.length; i++) {
            num= nums[i];
            if (map.containsKey(num))return new int[]{map.get(num),i};
            map.put(target-num,i);
        }
        return new int[]{-1,-1};
    }
}
