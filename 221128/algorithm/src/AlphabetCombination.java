public class AlphabetCombination {
    public void printAlphabet(char c){
        if(c > 'Z') return;
        System.out.println(c);

        printAlphabet((char)(c+1));
    }
    public static void main(String[] args) {
        AlphabetCombination ac = new AlphabetCombination();
        ac.printAlphabet('A');
    }
}
