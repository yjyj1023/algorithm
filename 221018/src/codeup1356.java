import java.util.Scanner;

public class codeup1356 {
    public void printSquare(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0|i==n-1 | j==0 | j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        codeup1356 c = new codeup1356();
        c.printSquare(num);
    }
}
