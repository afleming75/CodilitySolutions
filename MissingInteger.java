import java.util.*;

class Solution {
    public int solution(int[] A) {
        int num = 1;
        Arrays.sort(A);
        for (int nums : A){
            if (nums == num){
                num+=1;
            }
            if (nums > num){
                break;
            }
        }
        return num;
    }
}
