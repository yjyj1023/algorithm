public class InsertionSort {
    public int[] sort(int[] arr){
        int i = 1;
        return new int[]{};
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
