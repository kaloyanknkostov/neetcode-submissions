class Solution {
    public boolean hasDuplicate(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);

            }else return true;
        }
        return false;
    }
}