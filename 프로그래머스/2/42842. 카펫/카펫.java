class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum=brown+yellow;
        for(int i=1; i<=sum;i++)
        {
            if(sum%i==0) 
            {
                int divideNum=sum/i;
                if((i-2)*(divideNum-2)==yellow)
                {
                    answer[0]=divideNum;
                    answer[1]=i;
                    return answer;
                }       
            }
        }
        
        return answer;
    }
}