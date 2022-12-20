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
        boolean r = tc.isPrime(13, (a,b) -> a<b);
        boolean r2 = tc.isPrime(17, (a,b) -> a < b/2);
        boolean r3 = tc.isPrime(19, (a,b) -> a < Math.sqrt(b));

        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }
}
