import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[0] < 0 && A[1] < 0 && A[A.length-1] > 0){
            return Math.max(A[0] * A[1] * A[A.length-1], A[A.length-3] * A[A.length-2] * A[A.length-1]);
        } else {
            return A[A.length-3] * A[A.length-2] * A[A.length-1];
        }
    }
}
