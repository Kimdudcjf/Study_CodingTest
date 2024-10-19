package week_04;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");

        long sum = 0;

        for (int i = 0; i < A.length; i++) {
            int AtoInt = Integer.parseInt(A[i]);
            for (int j = 0; j < B.length; j++) {
                int BToInt = Integer.parseInt(B[j]);
                sum += (long) AtoInt * BToInt;
            }
        }

        System.out.println(sum);
    }
}
