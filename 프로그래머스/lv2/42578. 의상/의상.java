import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }
        
        Collection<Integer> values = map.values();
        answer = values.stream().reduce(1, (x, y) -> x*y) - 1;
        
        return answer;
    }
}