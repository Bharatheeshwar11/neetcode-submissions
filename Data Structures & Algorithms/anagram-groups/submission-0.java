class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> hs=new HashMap<>();
        for(String str: strs)
        {
            int[] freq = new int[26];
            for(char s:str.toCharArray())
            {
                freq[s-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<freq.length;i++)
            {
                sb.append(freq[i]).append("#");
            }
           String key=sb.toString();
            hs.putIfAbsent(key,new ArrayList<>());
            hs.get(key).add(str);
        }
        result.addAll(hs.values());
        return result;
    }
}
