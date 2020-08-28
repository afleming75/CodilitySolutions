import java.util.Map; 
import java.util.HashMap; 

class Solution {
    public int solution(int[] A) {
        if (A.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++){
            int key = A[i];
            map.putIfAbsent(key, 0);
            //map.put(key, map.get(key)+1);
        }
        return map.size();
    }
}

