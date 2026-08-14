class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return event1[1].compareTo(event2[0])>=0 &&event1[0].compareTo(event2[1])<=0;
    }
}  //o(1)ando(1)