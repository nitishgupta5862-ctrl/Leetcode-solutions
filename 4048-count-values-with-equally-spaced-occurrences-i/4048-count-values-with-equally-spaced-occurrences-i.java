class Solution {
    public int countSpecialIntegers(int[] nums) {
        // int special=0;
        // for(int i=0;i<nums.length;i++){
        //     boolean already=false;
        //     for(int k=0;k<i;k++){
        //         if(nums[k]==nums[i]){
        //             already=true;
        //             break;
        //         }
        //     }
        //     if(already)continue;
        //     int count=0;
        //     int index1=-1;
        //     int index2=-1;
        //     int index3=-1;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //             if(count==1){
        //                 index1=j;
        //             }
        //             else if(count==2){
        //                 index2=j;
        //             }else if(count==3){
        //                 index3=j;
        //             }
        //         }
        //         }
            
        //     if(count==3 && index2-index1==index3-index2){
        //         special++;
        //     }
        // }
        // return special;
    
        int n = nums.length;
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i =0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                
                for(int k = j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        if(map.get(nums[i])==3 &&k-j ==j-i){
                           cnt++    ;
                            // System.out.print(cnt+" ");
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
  