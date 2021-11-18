public class Segitiga {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println("");
//            mulainya di 0,1,2 baru print bawah
            for (int j=1; j<i; j++){
//              berarti disini 1<2 berarti cuma print sekali karena kondisi udah false abis itu
//              baru deh ulang lagi
                System.out.print("*");
            }
        }
    }
}
