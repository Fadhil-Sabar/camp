package Challenges;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inputkan jumlah bintang : ");
        int star = scanner.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star; j++) {
                if(i == 1 || i == star){
                    System.out.println("*");
                }else{
                    if(j == 1 || j == star){
                        System.out.println("*");
                    }else{
                        System.out.println(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
