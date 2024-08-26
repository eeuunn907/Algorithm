class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long a = 0;
        for(int i = 1; i<=count; i++){
            a += i*price;
        }
        
        if(a > money){
            answer = a - money;
        } else{
            answer = 0;
        }
            
        return answer;
    }
}