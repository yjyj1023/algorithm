public class TemplateCallbackPrime {
    boolean someOperator(int a, int b){
        return a < b;
    }

    boolean isPrime(int num) {
        boolean answer = true;

        for (int i = 2; someOperator(i,num); i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tc = new TemplateCallbackPrime();

        boolean result = tc.isPrime(13);
        System.out.println(result);
    }
}
