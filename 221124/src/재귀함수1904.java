import java.util.Scanner;

public class 재귀함수1904 {
    public void print(int a, int b){
        if(a>b) return;

        if(a%2 == 1) System.out.print(a+ " ");
        print(a+1,b);
    }
    public static void main(String[] args) {
        재귀함수1904 q = new 재귀함수1904();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        q.print(a,b);
    }
}
