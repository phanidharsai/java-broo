package com.phanidharsai.numberpatterns;

import java.util.Scanner;

public class IncreasingNumberSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=1;
        while(j<=n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(j + "  ");
            }
            System.out.println();
            j++;
        }
    }
}
