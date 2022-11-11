import java.util.Scanner;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        // arr1, arr2를 이진수로 바꿔서 저장
        for (int i = 0; i < arr1.length; i++) {

        }

        // 바꾼값들을 비교해서 같으면 # 다르면 공백 을 문자열에 저장



        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
    }
}
