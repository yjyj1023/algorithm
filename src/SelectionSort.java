public class SelectionSort {
    public int[] Swap(int[] arr, int idx1, int idx2){
        int temp;

        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public int[] Ascending(int[]arr){  //오름차순 정렬
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            Swap(arr,i,minIdx);
        }
        return arr;
    }
    public int[] Descending(int[]arr){  //내림차순 정렬
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>max){
                    max = arr[j];
                    maxIdx = j;
                }
            }
            Swap(arr,i,maxIdx);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSort s = new SelectionSort();
        int[] result = s.Ascending(arr);
        for(int i: result){
            System.out.print(i+" ");
        }

        System.out.println();

        int[] result2 = s.Descending(arr);
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
