import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        //중복을 제거하는 set선언
        Set<Integer> set1 = new HashSet<Integer>();

        //매개변수 nums를 set에 넣음
        for(int i = 0; i< nums.length; i++){
            set1.add(nums[i]);
        }

        //set의 사이즈가 더크면 answer는 (nums.length)/2
        if(set1.size()>(nums.length)/2){
            answer = (nums.length)/2;
        }else{  //(nums.length)/2의 사이즈가 더 크면 answer = set.size
            answer = set1.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,1,2,3};
        int[] arr2 = {3,3,3,2,2,4};
        int[] arr3 = {3,3,3,2,2,2};

        폰켓몬 a = new 폰켓몬();

        int result1 = a.solution(arr1);
        int result2 = a.solution(arr2);
        int result3 = a.solution(arr3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
