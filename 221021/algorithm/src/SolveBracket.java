import java.util.Stack;

public class SolveBracket {
    public boolean solution(String s){  //스택안쓰고
        boolean answer = true;

        while(s.indexOf("()")>=0){ //indexOf: 괄호안 문자열의 제일처음 인덱스 반환
            s = s.replace("()", "");  //replace: "()"-> "" 바꿈
        }

        return s.length()==0;
    }

    public boolean solution2(String s){  //스택쓰고
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) =='('){
                st.push(s.charAt(i));
            }else{
                if(st.empty()){
                    return false;
                }else{
                    st.pop();
                }

            }
        }


        return st.empty();
    }

    public static void main(String[] args) {
        SolveBracket solveBracket = new SolveBracket();
        boolean result1 = solveBracket.solution("(())");
        boolean result2 = solveBracket.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))");

        System.out.println(result1);
        System.out.println(result2);

        result1 = solveBracket.solution2("(())");
        result2 = solveBracket.solution2("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))");

        System.out.println(result1);
        System.out.println(result2);
    }
}
