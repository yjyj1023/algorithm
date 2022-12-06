import java.util.Arrays;

public class Heap {
    public int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }
    public int[] makeHeap(int[] arr, int parentIdx, int arrSize){

        int leftIdx = parentIdx*2 + 1;
        int rightIdx = parentIdx*2 + 2;
        int greaterIdx = parentIdx;

        if(leftIdx<arrSize && arr[leftIdx] > arr[parentIdx]) {
            greaterIdx = leftIdx;
        }

        if(rightIdx<arrSize && arr[rightIdx]> arr[greaterIdx]){
            greaterIdx = rightIdx;
        }

        if(parentIdx != greaterIdx){
            swap(arr, parentIdx,greaterIdx);
            makeHeap(arr, greaterIdx, arrSize);
        }

        return arr;
    }
    public static void main(String[] args) {
        Heap h = new Heap();

        int[] arr = {5, 8, 4, 7, 3, 2, 9, 6, 7};

        for (int i = arr.length-2; i >=0 ; i--) {
            arr = h.makeHeap(arr, i, arr.length);
            System.out.println(Arrays.toString(arr));
        }
    }
}
