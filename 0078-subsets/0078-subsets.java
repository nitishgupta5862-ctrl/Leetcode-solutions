class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int index=0;
        getAllSubsets(nums,index,ans,result);
        return result;
    }
    public void getAllSubsets(int[]nums,int index, List<Integer> ans,List<List<Integer>> result){
        if(index>=nums.length){
          List<Integer>  temp=new ArrayList<>(ans);
            result.add(temp);
            return;
        }
        int num=nums[index];
        //include
        ans.add(num);
        getAllSubsets(nums,index+1,ans,result);
          //backtracking se remove karenge
        ans.remove(ans.size()-1);
        //exclude
        getAllSubsets(nums,index+1,ans,result);

    }
}