class Solution {
    public int findKthNumber(int m, int n, int k) {
        int start = 1;
int end = m * n;       // 9

while (start < end) {

    int mid = start + (end - start) / 2;

    int count = 0;

    for (int i = 1; i <= m; i++) {
        count += Math.min(n, mid / i);
    }

    if (count >= k) {
        end = mid;
    } else {
        start = mid + 1;
    }
}
     return start;   
    }
}