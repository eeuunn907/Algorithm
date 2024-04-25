import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
 
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
 
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> workDays = getWorkDays(progresses, speeds);
        int[] answer = getDistributionCount(workDays);
 
        return answer;
    }
 
    private static Queue<Integer> getWorkDays(int[] progresses, int[] speeds) {
        int success = 0;
        Queue<Integer> workDays = new LinkedList<>();
 
        for (int i = 0; i < progresses.length; i++) {
            int count = 0;
            success = progresses[i];
 
            while (success < 100) {
                success += speeds[i];
                count++;
            }
            workDays.add(count);
        }
        return workDays;
    }
 
    private static int[] getDistributionCount(Queue<Integer> workDays) {
        List<Integer> answer = new ArrayList<>();
 
        while (!workDays.isEmpty()) {
            int currentWork = workDays.poll();
            int function = 1;
 
            while (!workDays.isEmpty() && currentWork >= workDays.peek()) {
                function++;
                workDays.poll();
            }
            answer.add(function);
        }
 
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}