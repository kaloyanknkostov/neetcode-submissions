class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var list = new HashMap<HashMap<Character,Integer>,List<String>>();
        HashMap<Character,Integer> map;
        for(String str:strs){
            map = turnToMap(str);
            if (list.containsKey(map)){
                var temp = list.get(map);
                temp.add(str);
                list.put(map,temp);
            }
            else list.put(map,new ArrayList<>(List.of(str)));
        }
        return new ArrayList<>(list.values());
    }
    private HashMap<Character,Integer> turnToMap(String str) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }
    
}
