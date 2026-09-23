class Solution {
    public String encode(List<String> strs) {
        String s = "";
        for (String word : strs) {
            s += word.length() + "#" + word;
        }
        return s;
    }

    public List<String> decode(String s) {
        List<String> eList = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;
            String numText = s.substring(i, j);
            int len = Integer.parseInt(numText);
            String word = s.substring(j + 1, j + 1 + len);
            eList.add(word);
            i = j + 1 + len;
        }
        return eList;
    }
}
