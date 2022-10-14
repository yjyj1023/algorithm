public class InsertionSort {
    public int[] sort(int[] arr){
        int i = 1;

        if(arr[i]<arr[i-1]){
            Swap(arr, i, i-1);
        }
        return new int[]{};
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
