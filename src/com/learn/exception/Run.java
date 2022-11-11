package com.learn.exception;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("-----Hello-----");
        Scanner scanner =new Scanner(System.in);
        int  a = scanner.nextInt();
        int  b = scanner.nextInt();
        String c = String.valueOf(scanner.nextInt());

        try {
            Card card = new Card(a, b, c);
            System.out.println(card.getCardNumber());

        } catch (NotValidCardException e) {
            throw new RuntimeException(e);
        }
    }
}
