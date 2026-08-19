class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // HashSet<Integer> set1=new HashSet<>();
        // HashSet<Integer> ans=new HashSet<>();

        // for(int num:nums1){
        //     set1.add(num);
        // }
        // for(int num:nums2){
        //     if(set1.contains(num)){
        //         ans.add(num);
        //     }
        // }
        // int result[]=new int[ans.size()];
        // int i=0;
        // for(int num:ans){
        //     result[i]=num;
        //     i++;
        // }
     
        // return result;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!ans.contains(nums1[i])){
                        ans.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
      return  result;
    }
}