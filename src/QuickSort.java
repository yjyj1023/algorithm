public class QuickSort {
    public int[] Swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }
    public int[] quickSort(int[] arr, int startIdx, int endIdx){

        int pivot = arr[(startIdx+endIdx)/2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        while(leftIdx<=rightIdx){
            while(arr[leftIdx]<pivot) leftIdx += 1;
            while(arr[rightIdx]>pivot) rightIdx -= 1;

            if(leftIdx <= rightIdx){
                arr = Swap(arr,leftIdx,rightIdx);
                leftIdx+=1;
                rightIdx-=1;
            }
        }

        if(startIdx<rightIdx)quickSort(arr, startIdx, rightIdx);
        if(leftIdx<endIdx)quickSort(arr, leftIdx, endIdx);

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort qs = new QuickSort();

        int[] result = qs.quickSort(arr, 0, arr.length-1);

        for(int i: result){
            System.out.println(i);
        }

    }
}
