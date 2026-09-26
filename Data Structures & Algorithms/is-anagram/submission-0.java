class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        String sKey = new String(sChars);
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        String tKey = new String(tChars);
        return sKey.equals(tKey);
    }
}

