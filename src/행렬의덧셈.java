public class 행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2},{2,3}};
        int[][] arr2 = new int[][]{{3,4},{5,6}};

        행렬의덧셈 a = new 행렬의덧셈();
        int[][] result = a.solution(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
