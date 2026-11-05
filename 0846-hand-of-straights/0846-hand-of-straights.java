class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)return false;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        Arrays.sort(hand);
        for(int i=0;i<hand.length;i++){
            if(map.get(hand[i])==0){
                continue;
            }
            for(int j=hand[i];j<hand[i]+groupSize;j++){
               if (!map.containsKey(j) || map.get(j) == 0) {
                    return false;
                }

                map.put(j, map.get(j) - 1);
            }
        }
        return true;
    }
}