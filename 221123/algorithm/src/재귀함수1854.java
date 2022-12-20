import java.util.Scanner;

public class 재귀함수1854 {
    public Long sum(Long num){
        if(num == 0) return num;

        return num%10+sum(num/10);

    }

    public static void main(String[] args) {
        재귀함수1854 a = new 재귀함수1854();
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        System.out.println(a.sum(num));
    }
}
