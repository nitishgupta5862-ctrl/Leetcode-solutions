// class Solution {
//     public int lengthOfLastWord(String s) {
        // int count=0;
        // int i=s.length()-1;
        // while(i>=0&&s.charAt(i)==' '){
        //     i--;
        // }
        // while(i>=0&&s.charAt(i)!=' '){
        //     count++;
        //     i--;
        // }
        // return count;
  //  }
//}
        //method 2
 class Solution {
    public int lengthOfLastWord(String s) {

        String[] arr = s.trim().split("\\s+");//|| iska use more than one space ko remove karne ke liye

        return arr[arr.length - 1].length();
 
    }
}
    