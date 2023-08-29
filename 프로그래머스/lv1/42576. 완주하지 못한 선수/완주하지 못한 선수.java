import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        Arrays.stream(participant).forEach(player -> {
            map.put(player, map.getOrDefault(player, 0) + 1);
        });
        
        Arrays.stream(completion).forEach(player -> {
            if(map.get(player) == 1){
                map.remove(player);
            } else {
                map.put(player, map.get(player) - 1);
            }
        });
        
        for (String key : map.keySet()){
            answer = key;
        }
        
        return answer;
    }
}