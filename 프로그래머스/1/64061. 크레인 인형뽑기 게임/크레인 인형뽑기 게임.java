/*
return 
게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수

1.
*/




import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();       
        
        for(int i =0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1] != 0 ) {                   
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]){
                        answer++;
                        stack.pop();
                        board[j][moves[i]-1] = 0;
                        break;
                    }else{
                        stack.push(board[j][moves[i]-1]);                      
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }                        
            }
        }
        
        return answer*2;
    }
}