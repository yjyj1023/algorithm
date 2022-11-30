import java.util.Scanner;

public class 두노드간의거리 {
    public static int goUp(int a, int b){
        if(a > b){
            return goUp(a/2 , b) + 1;
        }else if(a < b){
            return goUp(a, b/2) + 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = goUp(a,b);
        System.out.println(result);
    }
}
