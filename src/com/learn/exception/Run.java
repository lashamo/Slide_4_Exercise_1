package com.learn.exception;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("-----Hello-----");
        Scanner scanner = new Scanner(System.in);
        int cardNumber = scanner.nextInt();
        String personalId = scanner.next();

        try {
            Card card = new Card(cardNumber, 0, personalId);

            while (true) {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("0. xit");
                int mode = scanner.nextInt();

                if (mode == 0) {
                    break;
                } else if (mode == 1) {
                    depositOnCard(card, scanner);
                } else if (mode == 2) {
                    withdrawOnCard(card, scanner);
                }
            }

            System.out.println("Amount on card: " + card.getMoneyAmount());

        } catch (NotValidCardException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void depositOnCard(Card card, Scanner scanner){
        System.out.println("Enter amount for deposit on card");
        try {
            card.deposit(scanner.nextDouble());
        } catch (NotValidOperationException ex) {
            System.out.println(ex.getMessage());
        }

    }
    private static void withdrawOnCard(Card card, Scanner scanner){
        System.out.println("Enter amount for withdraw on card");
        try {
            card.withdraw(scanner.nextDouble());
        } catch (NotValidOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
