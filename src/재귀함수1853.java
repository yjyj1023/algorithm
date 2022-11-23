import java.util.Scanner;

public class 재귀함수1853 {

    public int sum(int num){
        if(num == 0)  return num;
        return num+sum(num-1);
    }

    public static void main(String[] args) {
        재귀함수1853 a = new 재귀함수1853();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        a.sum(num);
        System.out.println(a.sum(num));
    }
}
