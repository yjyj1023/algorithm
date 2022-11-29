import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 기수정렬 {
    public int[] getDigits(int[] arr){
        Set<Integer> digits = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) digits.add(1);
            else digits.add((int)(Math.log10(arr[i])+1));
        }

        // set -> arr
        int[] answer = new int[digits.size()];
        int idx = 0;
        for (Integer num : digits) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }
    public int[] sort(int[] arr){
        int[] sortedArr = new int[10];

        //-1로 초기화
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = -1;
        }

        //sortedArr의 인덱스 = arr의 원소 값 넣기
        for(int i: arr){
            sortedArr[i] = i;
        }
        return sortedArr;
    }
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};

        기수정렬 s = new 기수정렬();
        int[] result = s.getDigits(arr);

        for (int i: result){
            if(i != -1){
                System.out.print(i+" ");
            }
        }
    }
}
