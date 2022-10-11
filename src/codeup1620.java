import java.util.Scanner;

public class codeup1620 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        if(n<9){
            result = n;
        }else {
            while (n > 9) {
                result = 0;
                while (n > 0) {
                    result += n % 10;
                    n = n / 10;
                }
                n = result;
            }
        }
        System.out.println(result);
    }
}
