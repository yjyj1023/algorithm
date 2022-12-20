import java.util.Scanner;

public class 재귀함수1860 {
    public void star(int num){
        if(num == 0) return;
        star(num-1);
        System.out.print(num + " ");
    }
    public void print(int num){
        if (num == 0) return;
        print(num-1);

        star(num);
        System.out.println();
    }


    public static void main(String[] args) {
        재귀함수1860 a = new 재귀함수1860();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        a.print(num);
    }
}
