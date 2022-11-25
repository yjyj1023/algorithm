public class 최대공약수 {
    public int gcd(int a, int b){
        if(a==b) {
            return a;
        }else if (a>b){
            return gcd(a-b, b);
        }else if(a<b){
            return gcd(a,b-a);
        }
        return 1;
    }

    public static void main(String[] args) {
        최대공약수 a = new 최대공약수();

        System.out.println(a.gcd(196, 42));
    }
}
