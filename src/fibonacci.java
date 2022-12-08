public class fibonacci {

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

    public static void main(String[] args) {
        fibonacci f = new fibonacci();
        int n = 50;
        long result = f.fibDp(n, new long[n+1]);
        System.out.println(result);

        long result2 = f.fibRecursion(n);
        System.out.println(result2);
    }
}
