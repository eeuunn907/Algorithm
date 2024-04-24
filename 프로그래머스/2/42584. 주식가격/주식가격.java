/*
return 가격이 떨어지지 않은 기간은 몇 초 인가

1. 큐로 값을 받음
2. 큐가 값이 다 찼을 때 false를 반환
3.큐가 빌 때 까지 반복해준다
4.


*/
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            queue.offer(prices[i]);
        }

        int idx = 0;
        while (!queue.isEmpty()) {
            int item = queue.poll();
            for (int i = (prices.length - queue.size()); i < prices.length; i++) {
                if (item > prices[i]) {
                    answer[idx]++;
                    break;
                } else if (item <= prices[i]) {
                    answer[idx]++;
                }
            }
            idx++;
        }
        return answer;
    }
}