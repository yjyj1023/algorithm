public class BubbleSort {
    public int[] Sort(int[] arr) {
        int temp;

        for(int i =0; i<arr.length-1; i++ ){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

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
