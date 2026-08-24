class Solution {
    public int[] singleNumber(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        if(arr.length<=2){
            return arr;
        }
        if(arr[0]!=arr[1]){
            list.add(arr[0]);
        }
        if(arr[arr.length-1]!=arr[arr.length-2]){
            list.add(arr[arr.length-1]);
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        int[] nums = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
           nums[i] = list.get(i);
}
      return nums;


    }
}