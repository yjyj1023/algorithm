public class PrimeDivideUntil {

    //실습: 13, 17, 19, 23 이 소수인지 판별하는 알고리즘을 만들어 보고 소수인지 구해 보세요.

    //n이 들어왔을때 n-1까지 나누고 나머지가 0이 아니면 소수이다.
    boolean isPrime(int num) {
        boolean answer = true;

        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    //n이 들어왔을때 n/2까지 나누고 나머지가 0이 아니면 소수이다.
    boolean isPrime2(int num) {
        boolean answer = true;

        for (int i = 2; i <= num/2; i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    //n이 들어왔을때 루트n까지 나누고 나머지가 0이 아니면 소수이다.
    boolean isPrime3(int num) {
        boolean answer = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeDivideUntil a = new PrimeDivideUntil();

        boolean result = a.isPrime2(15);
        System.out.println(result);

        boolean result2 = a.isPrime2(17);
        System.out.println(result2);

        boolean result3 = a.isPrime2(19);
        System.out.println(result3);

        boolean result4 = a.isPrime2(23);
        System.out.println(result4);
    }
}