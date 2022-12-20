import java.util.Scanner;

public class p와y의개수 {
    boolean solution(String s) {
        s = s.toLowerCase();

        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') pCnt++;
            else if (s.charAt(i) == 'y') yCnt++;
        }

        if(pCnt == yCnt) return true;
        else return false;

    }

    public static void main(String[] args) {
        p와y의개수 q = new p와y의개수();
        System.out.println(q.solution("PyyyyypppP"));

    }
}
