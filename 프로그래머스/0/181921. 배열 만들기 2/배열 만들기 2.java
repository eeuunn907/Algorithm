import java.util.Arrays;
import java.util.regex.Pattern;

class Solution {
    public int[] solution(int l, int r) {
        int index = 0;
		int[] answer = new int[r];
		
		for(int num = l; num <= r; num++) {
			if(num % 5 == 0 && Pattern.matches("^[50]+$", String.valueOf(num))) {
				answer[index] = num;
				index ++;
			}
			if(num > 555555) break; 
		}
		
		if(answer[0] == 0) {
			answer = Arrays.copyOf(answer, 1);
			answer[0] = -1;
		}else {
			answer = Arrays.copyOf(answer, index);
		}
		
        return answer;
    }
}