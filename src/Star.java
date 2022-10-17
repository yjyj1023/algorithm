public class Star {
    public void starPrint(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 0; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Star star = new Star();

        star.starPrint(5);
    }
}
