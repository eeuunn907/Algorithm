class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        for(char in control)
            when(char){
            'w' -> answer += 1
            's' -> answer -= 1
            'd' -> answer += 10
            'a' -> answer -= 10
        }
        
        return answer
    }
}