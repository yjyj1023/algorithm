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

        //중간, 시작, 끝 인덱스
        int mid = n/2;
        int start = 0;
        int end = n;

        while(start <= end){
            mid = (start+end)/2;

            if(arr[mid] == s){
                return mid+1;
            }else if(arr[mid] < s){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        이분탐색 a = new 이분탐색();

        int result = a.solution();
        System.out.println(result);
    }
}

