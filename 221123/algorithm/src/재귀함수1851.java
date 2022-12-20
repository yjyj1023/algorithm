import java.util.Scanner;

public class 재귀함수1851 {
    public void print(int num){
        if(num==0) return;
        System.out.print("*");
        print(num-1);
    }

    public static void main(String[] args) {
        재귀함수1851 a = new 재귀함수1851();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        a.print(num);
    }
}
