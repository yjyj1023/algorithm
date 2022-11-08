import java.util.Scanner;

public class 데이터탐색 {
    public int solution(){
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(arr[i]==k){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        데이터탐색 a = new 데이터탐색();

        int result = a.solution();
        System.out.println(result);
    }
}
