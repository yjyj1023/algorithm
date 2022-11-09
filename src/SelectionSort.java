public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        //최소값 찾기
        int min = arr[0];
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                minIdx = i;
            }
        }

        System.out.println(min);
        System.out.println(minIdx);
    }
}
