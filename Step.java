public class Step {
    public static void main(String[] args) {
        int steps[]={1,2};
        int n=3;
        int dp[]={n};
        int ways=1;

        for (int i = 1; i <= n* steps.length ; i++) {
            if(n-dp[i] > 0)
                dp[i+1]=
        }

    }
}
