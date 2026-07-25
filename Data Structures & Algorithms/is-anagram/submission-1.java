class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length())return false;
        var map = new HashMap<Character, Integer>();
        char cha;
        Integer value;
        for (int i = 0; i < s.length() ; i++) {
            cha = s.charAt(i);
            value = map.get(cha);
            if ( value == null){
                map.put(cha,1);
            }
            else {
                map.replace(cha,value+1);
            }
        }
        for (int i = 0; i < s.length() ; i++) {
            cha = t.charAt(i);
            value = map.get(cha);
            if ( value == null){
                return false;
            }
            else if ( value == 0){
                return false;
            }
            else if (value == 1){
               map.remove(cha);
            }
            else {
                map.replace(cha,value-1);
            }
        }
        return map.isEmpty();
    }
}
