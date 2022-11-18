public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' & s.charAt(i) <= 'Z'){  //대문자일 경우
                if (!((s.charAt(i)+n)>='A' & (s.charAt(i)+n)<='Z')) {
                    answer = answer + String.valueOf((char)(s.charAt(i)+n-26));
                }else{
                    answer = answer + String.valueOf((char)(s.charAt(i)+n));
                }
            }else if (s.charAt(i) >= 'a' & s.charAt(i) <= 'z'){  //소문자일 경우
                if (!((s.charAt(i)+n)>='a' & (s.charAt(i)+n)<='z')) {
                    answer = answer + String.valueOf((char)(s.charAt(i)+n-26));
                }else{
                    answer = answer + String.valueOf((char)(s.charAt(i)+n));
                }
            }else{  //공백일 경우
                answer = answer + " ";
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "AB";
        int i = 1;

        시저암호 a = new 시저암호();
        String result = a.solution(s,i);
        System.out.println(result);
    }
}
