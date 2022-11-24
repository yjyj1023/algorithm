import java.util.Scanner;

public class 재귀함수1859 {
    public void star(int num){
        if(num == 0) return;
        star(num-1);
        System.out.print("*");
    }
    public void print(int num){
        if (num == 0) return;
        print(num-1);

        star(num);
        System.out.println();
    }

    public static void main(String[] args) {
        재귀함수1859 a = new 재귀함수1859();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        a.print(num);
    }
}
