import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public int[] Swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public int[] quickSort(int[] arr){
        int pivot = arr[arr.length/2];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<pivot){
                left.add(arr[i]);
            } else if (arr[i]>pivot) {
                right.add(arr[i]);
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        QuickSort qs = new QuickSort();

        int[] result = qs.quickSort(arr);

        for(int i:result){
            System.out.println(i);
        }
    }
}
