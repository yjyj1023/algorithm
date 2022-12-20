public class Diamond {
    private String letter = "*";

    public Diamond(){

    }
    public Diamond(String letter){
        this.letter = letter;
    }

    public void starPrint(int num){
        for(int i = 1; i <= num/2; i++){
            for(int j = num/2-i; j>=0; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <=2*i -1; j++){
                System.out.print(letter);
            }
            System.out.println();
        }

        for(int i = num/2+1; i >= 1; i--){
            for(int j = num/2-i; j>=0; j--){
                System.out.print(" ");
            }

            for(int j = 2*i -1; j >0; j--){
                System.out.print(letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Diamond diamond = new Diamond("*");

        diamond.starPrint(5);


    }
}
