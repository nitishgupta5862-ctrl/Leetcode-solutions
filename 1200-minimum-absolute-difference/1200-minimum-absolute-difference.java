class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
       //  List<Integer> ad=new ArrayList<>();yaha galt ho jayega
         int min=Integer.MAX_VALUE;
         Arrays.sort(arr);
         for(int i=0;i<arr.length-1;i++){ //minimum nikal kar
           if(arr[i+1]-arr[i]<min){
            min=arr[i+1]-arr[i];
           }
         }
        for(int i=0;i<arr.length-1;i++){  //jo jo min ke equal hai pairs nikal do
          List<Integer> ad=new ArrayList<>();
            if(arr[i+1]-arr[i]==min){
                ad.add(arr[i]);
                ad.add(arr[i+1]);
                ans.add(ad);
            }
        }
        return ans;
    }
}