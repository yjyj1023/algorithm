public class QuickSort {
    public int[] Swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }
    public int[] quickSort(int[] arr){
        int pivot = arr[arr.length/2];
        int leftIdx = 0;
        int rightIdx = arr.length-1;

        while(arr[leftIdx]<pivot) leftIdx += 1;
        while(arr[rightIdx]>pivot) rightIdx -= 1;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};


    }
}
