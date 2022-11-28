public class AlphabetCombination {
    public static void main(String[] args) {
        int cnt = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                System.out.printf("%c%c\n",i,j);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
