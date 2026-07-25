class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var counts = new int[2001];
        Arrays.fill(counts,0);
        for(int num:nums){
            counts[num+1000]++;
        }
        var map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i]==0)continue;
            map.computeIfAbsent(counts[i],l -> new ArrayList<>()).add(i-1000);
        }
        var sorted = new ArrayList<>(map.keySet());
        sorted.sort(Comparator.reverseOrder());
        var counter =0;
        ArrayList<Integer> out= new ArrayList<>();
        for(int num:sorted){
           out.addAll(map.get(num));
           if(out.size()==k)break;
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}
