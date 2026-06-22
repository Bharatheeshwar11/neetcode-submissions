class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int num:nums)
        {
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>[] buckets=new ArrayList[nums.length + 1];
        for(int i=0;i<buckets.length;i++)
        {
            buckets[i]=new ArrayList<>();
        }
        for(int key: hs.keySet())
        {
            int freq = hs.get(key);
            buckets[freq].add(key);
        }
        int[] result = new int[k]; 
        int index=0;
        for(int j=buckets.length-1 ; j>=0 && index<k;j--)
        {
            for(int n:buckets[j])
            {
                result[index++]=n;
                 if(index==k)
                 {
                   break;
                 }
            }
        }
        return result;
    }
}
