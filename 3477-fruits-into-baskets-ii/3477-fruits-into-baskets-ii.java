class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    break;
                }
            }
        }
            int count=0;
            for(int i=0;i<baskets.length;i++){
                if(baskets[i]!=-1){
                    count++;
                }
            }
        return count;
    }
}