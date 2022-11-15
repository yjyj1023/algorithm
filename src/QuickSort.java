import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public int[] Swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public List<Integer> quickSort(List<Integer> arr){
        if(arr.size() == 0){
            return arr;
        }else{
            int pivot = arr.get(arr.size()/2);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            List<Integer> mid = new ArrayList<>();
            List<Integer> result = new ArrayList<>();


            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)<pivot){
                    left.add(arr.get(i));
                } else if (arr.get(i)>pivot) {
                    right.add(arr.get(i));
                }else{
                    mid.add(arr.get(i));
                }
            }

            result.addAll(quickSort(left));
            result.addAll(mid);
            result.addAll(quickSort(right));

            return result;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        QuickSort qs = new QuickSort();

        List<Integer> result = qs.quickSort(arrList);

        for(int i:result){
            System.out.println(i);
        }
    }
}
