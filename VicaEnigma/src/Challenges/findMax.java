package Challenges;

import java.util.Arrays;

public class findMax {
    public static void findMax(int[] arr){
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        System.out.println(max);
    }

    public static void main(String[] args) {
        findMax(new int[]{1, 1, 5, 6, 2});
    }
}
