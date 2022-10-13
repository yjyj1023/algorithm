public class BubbleSort {
    public int[] Sort(int[] arr, int num) {
        int temp;

        for (int i = num+1; i < arr.length; i++) {
            if (arr[num] > arr[i]) {
                temp = arr[num];
                arr[num] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        BubbleSort bubbleSort = new BubbleSort();
        int[] result1 = bubbleSort.Sort(arr, 0);
        int[] result2 = bubbleSort.Sort(result1, 1);
        int[] result3 = bubbleSort.Sort(result2, 2);
        int[] result4 = bubbleSort.Sort(result3, 3);
        int[] result5 = bubbleSort.Sort(result4, 4);

        for (int i : result5) {
            System.out.print(i + " ");
        }
    }
}
