public class Coins {
    public static void main(String[] args) {
        int coins[]={1,2,5,6};
        int amount =11;

        int dp[][] = new int[coins.length][amount+1];

        for (int i = 0; i < coins.length; i++) {
            dp[i][0]=0;
        }

        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j < amount; j++) {
                if(coins[i]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i]]);
            }
        }

        for (int i = 0; i < coins.length; i++) {
            System.out.println(dp[i][amount]);
        }

    }
}
