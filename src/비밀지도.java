import java.util.Arrays;
import java.util.Scanner;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {  //배열로 풀기
        String[] answer = {};

        int[][] arr1ToBinary = new int[n][n];
        int[][] arr2ToBinary = new int[n][n];

        // arr1, arr2를 이진수로 바꿔서 저장
        for (int i = 0; i < arr1.length; i++) {
            for (int j = n-1; j >= 0 ; j--) {
                arr1ToBinary[i][j] = arr1[i]%2;

                arr1[i] = arr1[i]/2;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = n-1; j >= 0 ; j--) {
                arr2ToBinary[i][j] = arr2[i]%2;

                arr2[i] = arr2[i]/2;
            }
        }

        answer = new String[n];

        // 바꾼값들을 비교해서 둘중 하나만 1이면 # 둘다 0이면 공백을 문자열에 저장
        for (int i = 0; i < arr1ToBinary.length; i++) {
            answer[i]="";  //초기화
            for (int j = 0; j < arr1ToBinary[i].length; j++) {
                if(arr1ToBinary[i][j]==1 | arr2ToBinary[i][j]==1){
                    answer[i]+="#";
                }else{
                    answer[i]+=" ";
                }
            }
        }
        return answer;
    }

    String solution2(int n, int[] arr1, int[] arr2) { //개수에 맞는 이진수 배열
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            // arr1
            for (int j = 0; j < n; j++) {
                String binStr1 = Integer.toBinaryString(arr1[i]);
                String binStr2 = Integer.toBinaryString(arr2[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
                sArr2[i] = "0".repeat(n - binStr2.length()) + Integer.toBinaryString(arr2[i]);
            }
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

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

        비밀지도 a = new 비밀지도();

        String[] result = a.solution(n, arr1, arr2);

        for (String s: result){
            System.out.println(s);
        }
    }
}
