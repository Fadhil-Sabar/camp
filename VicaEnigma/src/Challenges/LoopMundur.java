package Challenges;

import java.util.Scanner;

public class LoopMundur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = input; i > 0; i--) {
            System.out.println(i + " - I will become a java developer");
        }
    }
}
