public class 기수정렬 {
    public int[] sort(int[] arr){
        int[] sortedArr = new int[10];

        //-1로 초기화
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = -1;
        }

        //sortedArr의 인덱스 = arr의 원소 값 넣기
        for(int i: arr){
            sortedArr[i] = i;
        }
        return sortedArr;
    }
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};

        기수정렬 s = new 기수정렬();
        int[] result = s.sort(arr);

        for (int i: result){
            System.out.print(i+" ");
        }

    }
}
