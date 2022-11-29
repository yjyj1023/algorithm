import java.util.*;

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
    public int[] sort(int[] arr, int digit){
        // Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        //자릿수에 맞게 queue에 넣기 1, 10, 100 ...
        for (int i = 0; i < arr.length ; i++) {
            int divisor = (int) Math.pow(10, digit - 1); // 10의 0제곱이므로 1의자리
            queueArr[Math.floorDiv(arr[i], divisor) % 10].add(arr[i]);
        }

        // queue에서 꺼내서 arr로 만들기
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) { // queueArr을 반복 합니다.
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        기수정렬 s = new 기수정렬();

        int[] arr = {7, 4, 5, 9, 1, 0, 20};
        int[] digits = s.getDigits(arr);

        for (var digit : digits) {
            arr = s.sort(arr, digit);
        }
        System.out.println(Arrays.toString(arr));

    }
}
