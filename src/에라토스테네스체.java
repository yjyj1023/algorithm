public class 에라토스테네스체 {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n-1];

        for (int i = 0; i <n-1 ; i++) {
            arr[i] = i+2;
        }

        for (int i = 0; i <n-1 ; i++) {
            if(arr[i]%2 == 0 & arr[i] != 2){
                arr[i] = 0;
            };
        }
    }
}
