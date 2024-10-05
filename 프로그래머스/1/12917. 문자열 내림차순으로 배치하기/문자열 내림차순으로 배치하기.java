import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i<a.length; i++){
            answer += a[i];
        }
        return answer;
    }
}