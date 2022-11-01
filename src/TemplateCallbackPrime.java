interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    boolean isPrime(int num, StatementStrategy stmt) {
        boolean answer = true;

        for (int i = 2; stmt.compare(i,num); i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tc = new TemplateCallbackPrime();
        boolean r = tc.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a <= Math.sqrt(b);
            }
        });

        System.out.println(r);
    }
}
