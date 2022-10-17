public class Pyramid {
    private String letter = "*";

    public Pyramid(){

    }
    public Pyramid(String letter){
        this.letter = letter;
    }

    public void starPrint(int num){
        for(int i = 1; i <= num; i++){
            for(int j = num-i; j>0; j--){
                System.out.print(" ");
            }

            for(int j = 0; j <2*i -1; j++){
                System.out.print(letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid("*");

        pyramid.starPrint(5);


    }
}
