class Solution {
    public int solution(int[] A) {
        int count0 = 0;
        int passes = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] == 0){
                count0++;
            } else if (A[i] == 1){
                passes += count0;
                if (passes > 1000000000){
                    return -1;
                }
                //System.out.print(passes);
            }
        }
        
        return passes;
    }
}
