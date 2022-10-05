public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");
        //10칸의 int array를 만들고
        //1부터 10까지 채워보기
        //그리고 콘솔에 출력하기

        int[] arr = new int[10];

        for(int i =0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}