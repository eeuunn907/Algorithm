import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> digitList = new ArrayList<>();

        while (n > 0) {
            int digit = (int)(n % 10);
            digitList.add(digit);
            n /= 10;
        }

        int[] answer = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            answer[i] = digitList.get(i);
        }
        return answer;
    }
}