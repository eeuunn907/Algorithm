import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String answer = "";
        
        for(int i = 0; i < participant.length; i++){
            if(map.get(participant[i]) != null){
                map.put(participant[i], map.get(participant[i]) + 1);
            } else{
                map.put(participant[i],1);
            }
        }
        
        for(int i = 0; i < completion.length; i++){
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}