class Solution {
      public String encode(List<String> strs) {
          if (strs.isEmpty()) return "";
          var sb = new StringBuilder();
          for (String str : strs) {
              sb.append(str.length());
              sb.append('#');
              sb.append(str);
          }
          return sb.toString();
      }
      public List<String> decode(String str) {
          var out = new ArrayList<String>();
          int i = 0;
          while (i < str.length()) {
              int separator = str.indexOf('#', i);
              int length = Integer.parseInt(str.substring(i, separator));
              i = separator + 1;
              out.add(str.substring(i, i + length));
              i += length;
          }
          return out;
      }
  }
