package com.learn.exception;

public class Card {

    private int cardNumber;
    private double moneyAmount;
    private String ownerPersonalNumber;

    public Card() {

    }

    public Card(int cardNumber, double moneyAmount, String ownerPersonalNumber) throws NotValidCardException {
        setCardNumber(cardNumber);
        setMoneyAmount(moneyAmount);
        setOwnerPersonalNumber(ownerPersonalNumber);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) throws NotValidCardException {
        if (cardNumber % 2 == 0 || cardNumber <= 10_000) {
            throw new NotValidCardException("Card number is not valid");
        }
        this.cardNumber = cardNumber;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) throws NotValidCardException {
        if (moneyAmount < 0) {
            throw new NotValidCardException("Money amount is less than 0");
        }
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerPersonalNumber() {
        return ownerPersonalNumber;
    }

    public void setOwnerPersonalNumber(String ownerPersonalNumber) throws NotValidCardException {
        if (ownerPersonalNumber.length() != 11) {
            throw new NotValidCardException("Personal number must be 11 character");
        }
        this.ownerPersonalNumber = ownerPersonalNumber;
    }

    public void deposit(double amount) throws NotValidOperationException {
        if (amount < 0) {
            throw new NotValidOperationException("Amount must be more than 0");
        }
        moneyAmount = moneyAmount + amount;
    }

    public void withdraw(double amount) throws NotValidOperationException {
        if (amount < 0) {
            throw new NotValidOperationException("Amount must be more than 0");
        }
        if (amount > moneyAmount) {
            throw new NotValidOperationException("Withdraw amount must be more or equal than money amount");
        }
        moneyAmount = moneyAmount - amount;
    }
}
