class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String ,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
        map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
                    if (!map.get(a).equals(map.get(b))) {
                return Integer.compare(map.get(b), map.get(a));
            }
            return a.compareTo(b);
        });

        for(String key:map.keySet()){
            pq.add(key);
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
           ans.add(pq.remove());
        }
     return ans;
    }
}