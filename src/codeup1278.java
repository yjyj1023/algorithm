import java.util.Scanner;

public class codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;

        while(n>0){
            n/=10;
            cnt ++;
        }
        System.out.println(cnt);
    }
}
