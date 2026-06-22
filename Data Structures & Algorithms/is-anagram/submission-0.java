class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c : s.toCharArray())
        {
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(char k : t.toCharArray())
        {
            if(!hs.containsKey(k))
            {
                return false;
            }
            hs.put(k,hs.get(k)-1);
            if(hs.get(k)==0)
            {
                hs.remove(k);
            }
        }
        return hs.isEmpty();
    }
}
