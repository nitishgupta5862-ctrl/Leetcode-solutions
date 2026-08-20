class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
       int i=2;
       while(i<nums.length){
        if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
            arr1.add(nums[i]);
        }
        else{
            arr2.add(nums[i]);
        }
        i++;
       }
       int j=0;
       int k=0;
       while(j<arr1.size()){
         result.add(arr1.get(j));
         j++;
       }
       while(k<arr2.size()){
        result.add(arr2.get(k));
        k++;
       }
       int ans[]=new int[result.size()];
       for(int m=0;m<result.size();m++){
         ans[m]=result.get(m);
       }
return ans;
    }
}