class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map1.containsKey(a)) {

                if (map1.get(a) != b) {
                    return false;
                }

            } else {

                if (map2.containsKey(b)) {
                    return false;
                }

                map1.put(a, b);
                map2.put(b, true);
            }
        }

        return true;
    }
}