import java.util.Scanner;

public class 이분탐색 {
    public int solution(){ //이진탐색 이용
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        //정수 n과 찾고자 하는 값 s 입력받기
        int n = sc.nextInt();
        int s = sc.nextInt();

        //n크기의 배열 생성
        int[] arr = new int[n];

        //배열에 데이터를 입력받아 넣기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mid = n/2;
        int start = 0;
        int end = n;

        while(arr[mid] != s){
            if(arr[mid] > s){
                end = mid-1;
                mid = end/2;
            }else{
                start = mid+1;
                mid = (start+end)/2;
            }
        }

        if(arr[mid] == s){
            answer = mid+1;
        }else{
            answer = -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        이분탐색 a = new 이분탐색();

        int result = a.solution();
        System.out.println(result);
    }
}

