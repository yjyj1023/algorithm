public class InsertionSort {
    public int[] sort(int[] arr){


        for(int i = 1; i<arr.length; i++){

            for(int j = i-1; j>=0; j--){
                if(arr[i]<arr[j]){
                    Swap(arr, i, j);
                    i = j;
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

        for(int a: result){
            System.out.print(a+" ");
        }

    }
}
