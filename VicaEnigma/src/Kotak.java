public class Kotak {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            for (int j = 1; j <= 5; j++) {
                if(i>1 && i!=5 && j>1) {
                    System.out.print(" ");
                    if(j==5){
                        System.out.print("  *");
                    }
                }else{
                    System.out.print("* ");
                }
            }
        }
    }
}
