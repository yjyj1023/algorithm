import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeup1443 {
    public int[] sort(int[] arr){
        int target;
        int target_idx;

        for(int i = 1; i<arr.length; i++){
            target = arr[i];
            target_idx = i;
            for(int j = target_idx-1; j>=0; j--){
                if(target<arr[j]){
                    Swap(arr, target_idx, j);
                    target_idx = j;
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
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        codeup1443 cu = new codeup1443();
        int[] result = cu.sort(arr);


        for(int a: result){
            System.out.print(a+" ");
        }

    }
}
