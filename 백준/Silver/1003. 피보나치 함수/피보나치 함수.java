import java.util.Scanner;

public class Main {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = in.nextInt();

        while (T-- > 0) {
            int N = in.nextInt();
            fibonacci(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }

    static void fibonacci(int N) {
        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }
    }
}