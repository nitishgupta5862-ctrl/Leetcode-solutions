class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));
        int longchain=1;
        int endchain=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>endchain){
                longchain++;
                endchain=pairs[i][1];
            }
        }
        return longchain;
    }
}