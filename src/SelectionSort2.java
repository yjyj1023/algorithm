interface StatementStrategy{
    boolean apply(int a, int b);
}

public class SelectionSort2 {
    public int[] Swap(int[] arr, int idx1, int idx2){
        int temp;

        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public int[] selectionSort(int[]arr, StatementStrategy stmt){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(stmt.apply(arr[j],min)){
                    min = arr[j];
                    minIdx = j;
                }
            }
            Swap(arr,i,minIdx);
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSort2 s = new SelectionSort2();
        int[] result = s.selectionSort(arr, (a,b) -> a<b); //오름차순 정렬
        for(int i: result){
            System.out.print(i+" ");
        }

        System.out.println();

        int[] result2 = s.selectionSort(arr, (a,b) -> a>b); //내림차순 정렬
        for(int i: result2){
            System.out.print(i+" ");
        }
    }
}
