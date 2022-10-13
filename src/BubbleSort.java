public class BubbleSort {
    public int[] Sort(int[] arr) {
        for(int i =0; i<arr.length-1; i++ ){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public int[] Swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.Sort(arr);


        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
