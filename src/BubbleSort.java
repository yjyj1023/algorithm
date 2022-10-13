public class BubbleSort {
    public int[] Sort(int[] arr){
        int temp;

        for(int i = 0; i<arr.length; i++){
            if(arr[0]>arr[i]){
                temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};

        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.Sort(arr);

        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
