public class Fibonacci {

    public long fibRecursion(int a){
        if(a <= 2) return 1;

        return fibRecursion(a-1) + fibRecursion(a-2);

    }

    public long fibDp(int a, long[] memo){
        if(a <= 2) return 1;

        if(memo[a] == 0){
            memo[a] = fibDp(a-1, memo) + fibDp(a-2, memo);
        }

        return memo[a];
    }

    public long fibDp2(int a, long[] memo){
        memo[1] = 1;
        memo[2] = 1;

        for (int i = 3; i < memo.length; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }

        return memo[a];
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int n = 50;
        long result = f.fibDp(n, new long[n+1]);
        System.out.println(result);


        long result3 = f.fibDp2(n, new long[n+1]);
        System.out.println(result3);


        //long result2 = f.fibRecursion(n);
        //System.out.println(result2);
    }
}
