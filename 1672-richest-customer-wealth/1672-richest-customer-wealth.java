class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
             int maxwealth=0;
            for(int j=0;j<accounts[i].length;j++){  
                maxwealth +=accounts[i][j];
            }
            max=Math.max(max,maxwealth);
        }
        return max;
    }
}