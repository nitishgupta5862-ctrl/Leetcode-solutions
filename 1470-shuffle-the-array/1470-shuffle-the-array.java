class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list1=new ArrayList<>();
         ArrayList<Integer>list2 =new ArrayList<>();
          ArrayList<Integer>ans =new ArrayList<>();
        int n2=nums.length;
       // int n=n2/2;
        //int []first=new int[n];
        for(int i=0;i<n2/2;i++){
            list1.add(nums[i]);
        }
        for(int i=n;i<n2;i++){
            list2.add(nums[i]);
        }
        for(int i=0;i<list1.size();i++){
            ans.add(list1.get(i));
            ans.add(list2.get(i));

        }

        return ans.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}