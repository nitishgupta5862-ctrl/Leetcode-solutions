class Solution {
    public String reverseVowels(String s) {
        char[]arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isvowel(arr[i])){
                i++;
            }
            else if(!isvowel(arr[j])){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public  boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}