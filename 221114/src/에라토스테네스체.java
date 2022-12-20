public class 에라토스테네스체 {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n-1];

        // 2 ~ 50까지 값 채우기
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 2;
        }


        for (int i = 0; i * i <= n ; i++) {
            if (arr[i] != 0) {
                for (int j = i * 2 + 2; j < arr.length; j += arr[i]) {
                    arr[j] = 0;
                }
            }
        }

        for(int i: arr){
            if(i != 0){
                System.out.println(i);
            }
        }


    }
}
