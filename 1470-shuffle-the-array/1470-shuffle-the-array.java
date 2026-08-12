class Solution {
    public int[] shuffle(int[] nums, int n) {
    //     ArrayList<Integer> list1=new ArrayList<>();
    //      ArrayList<Integer>list2 =new ArrayList<>();
    //       ArrayList<Integer>ans =new ArrayList<>();
    //     int n2=nums.length;
    //     for(int i=0;i<n2/2;i++){
    //         list1.add(nums[i]);
    //     }
    //     for(int i=n;i<n2;i++){
    //         list2.add(nums[i]);
    //     }
    //     for(int i=0;i<list1.size();i++){
    //         ans.add(list1.get(i));
    //         ans.add(list2.get(i));

    //     }

    //     return ans.stream()
    //               .mapToInt(Integer::intValue)
    //               .toArray();
    int n2=nums.length;
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    for(int  i=0;i<n2;i++){
        q1.add(nums[i]);
    }
    for(int i=1;i<=n2/2;i++){
        q2.add(q1.remove());
    }
    while(!q2.isEmpty()){
        q1.add(q2.remove());
        q1.add(q1.remove());
    }
    int ans[]=new int[n2];
    for(int i=0;i<n2;i++){
        ans[i]=q1.remove();
    }
    return ans;
    }
}