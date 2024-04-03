/*
1. 괄호의 길이만큼 반복해준다
2. '(' 괄호가 들어오면 push를 해줘서 저장을 해준다.
3. ')' 괄호가 들어오면 짝을 맞춰줘서 pop을 해준다. 여기서 조건문으로 값이 없으면 false를 반환해준다
4. 스택이 전부 비면 true를 해주고 짝이 맞지 않을 때 false를 반환해준다.

return
-'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false
*/
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}