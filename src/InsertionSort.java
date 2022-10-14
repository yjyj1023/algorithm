public class InsertionSort {
    public int[] sort(int[] arr){
        int target;
        int target_idx;

        for(int i = 1; i<arr.length; i++){
            target = arr[i];
            target_idx = i;
            for(int j = target_idx-1; j>=0; j--){
                if(target<arr[j]){
                    Swap(arr, target_idx, j);
                    target_idx = j;
                }
            }
        }
        return arr;
    }

    public void Swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort is = new InsertionSort();
        int[] result = is.sort(arr);

        for(int a: arr){
            System.out.print(a+" ");
        }

    }
}
