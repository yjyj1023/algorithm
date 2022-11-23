import java.util.Scanner;

public class 재귀함수1912 {
    public int factorial(int num){
        if(num==1) return num;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        재귀함수1912 a = new 재귀함수1912();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        a.factorial(num);
        System.out.println(a.factorial(num));
    }
}
