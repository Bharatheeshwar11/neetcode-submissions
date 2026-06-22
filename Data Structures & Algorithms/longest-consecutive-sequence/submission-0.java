class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        int longest=0;
        for(int n:hs)
        {   
            if(!hs.contains(n-1))
            {
                int length=1;
                int current=n;
                while(hs.contains(current+1))
                {
                    current++;
                    length++;
                }
                longest =Math.max(longest,length);
            }
        }
        return longest;
    }
}
