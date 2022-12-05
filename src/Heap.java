import java.util.Arrays;

public class Heap {
    public int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }
    public int[] childrenIndex(int parentIdx){
        int[] arr = new int[2];

        arr[0] = parentIdx*2 + 1;
        arr[1] = parentIdx*2 + 2;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,7,8};

        Heap h = new Heap();
        h.swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        h.swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }

}
