public class codeup1859 {
    public void star(int n){
        if(n==0)
            return;
        star(n-1);
        System.out.print("*".repeat(n));
        System.out.println();

    }

    public static void main(String[] args) {
        codeup1859 c = new codeup1859();
        c.star(5);

    }
}
