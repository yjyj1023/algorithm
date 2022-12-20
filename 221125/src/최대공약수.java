import java.util.Scanner;

public class 최대공약수 {
    public int gcd(int a, int b){  //재귀 o
        if(a==b) {
            return a;
        }else if (a>b){
            return gcd(a-b, b);
        }else if(a<b){
            return gcd(a,b-a);
        }
        return 1;
    }

    public int gcd2(int a, int b){  //재귀 x
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }



    public static void main(String[] args) {
        최대공약수 q = new 최대공약수();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(q.gcd2(a,b));
    }
}
