import java.util.Arrays;
import java.util.Scanner;

public class 데이터탐색 {
    public int solution(){ //단순탐색 이용
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        //데이터 개수 n 입력받기
        int n = sc.nextInt();

        //n크기의 배열 생성
        int[] arr = new int[n];

        //배열에 데이터를 입력받아 넣기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //k 입력받기
        int k = sc.nextInt();

        //배열을 돌면서 원소에 k가 있으면 k의 인덱스 리턴, 없으면 -1 리턴
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
