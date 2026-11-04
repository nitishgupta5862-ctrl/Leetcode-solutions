class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
       //isme sort karke  queue me indixied store karwa denge uske baad ek indicies remove karenege uske baad ne aaray me usindex per value assign karenge phir uske baad wale index ko piche dalenge ge queue me jb tak le khali nhi ho jata
       Arrays.sort(deck);
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<deck.length;i++){
        q.add(i);
       } 
       int ans[]=new int[deck.length];
       for(int x:deck){
        int idx=q.remove();
         ans[idx]=x;
         if(!q.isEmpty()){
            q.add(q.remove());
         }
       }
       return ans;
    }
}