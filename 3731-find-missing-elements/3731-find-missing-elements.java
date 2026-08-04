class Solution {
    public List<Integer> findMissingElements(int[] nums) {
//         ArrayList<Integer> list=new ArrayList<>();
//         Arrays.sort(nums);
//         int low=nums[0];
//         int high=nums[nums.length-1];
//         int x=0;
//         for(int i=low;i<=high;i++){
//             if(nums[x]==i){
//                 x++;
//             }
//             else{
//                 list.add(i);
//             }
//         }
//         return list;
//     }
// }
ArrayList<Integer> list=new ArrayList<>();
HashSet<Integer> set=new HashSet<>();
 Arrays.sort(nums);
 int low=nums[0];
 int high=nums[nums.length-1];
 for(int i=0;i<nums.length;i++){
       set.add(nums[i]);
 }
 for(int i=low;i<=high;i++){
    if(!set.contains(i)){
        list.add(i);
    }
 }
 return list;
    }
}
