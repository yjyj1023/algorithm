public class MinCostPath {
    public int minCost(int[][] arr){
        int answer = 0;
        int[][] dp = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];

        //첫번째 행 계산
        for (int i = 0; i < dp[0].length-1; i++) {
            dp[0][i+1] = dp[0][i] + arr[0][i+1];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,2},
                {4,6,2},
                {1,2,4}};
    }
}
