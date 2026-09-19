class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            }
            for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)-'a']==1)
        return i;
        }
    return -1;

    //method 2
//    for(int i=0;i<s.length();i++){
//     int count=0;
//     for(int j=0;j<s.length();j++){
//         if(s.charAt(i)==s.charAt(j)){
//             count++;                        //tle dega
//         }
//     }
//     if(count==1){
//         return i;
//     }
//    }
//    return -1;
    }
}