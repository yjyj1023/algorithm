import java.util.Arrays;
import java.util.PriorityQueue;

public class K번째수 {

    //배열 사용
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }

    //우선순위 큐 사용
    public int[] solution2(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            // 우선순위 큐에 from, to까지 넣기
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                pq.add(arr[j]);
            }
            // 정렬이 되었기 때문에 뽑기만 한다.
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = pq.poll(); //stack의 pop과 비슷
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        K번째수 a = new K번째수();

        int[] arr1 = a.solution2(arr, commands);
        for(int q: arr1){
            System.out.println(q);
        }
    }
}
