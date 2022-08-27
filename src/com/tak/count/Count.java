package com.tak.count;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("카운트 다운 합니다!");

        int x;

        do {
            System.out.print("양의 정숫값 : ");
            x = sc.nextInt();
        } while (x <= 0);

        for (; x >= 0; x--) {
            System.out.println(x);
        }
    }
}
