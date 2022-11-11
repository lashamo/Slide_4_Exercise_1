package com.learn.exception;

public class Card {

    private int cardNumber;
    private double moneyAmount;
    private  String ownerPersonalNumber;

    public Card(){

    }
    public Card (int cardNumber, double moneyAmount, String ownerPersonalNumber) throws NotValidCardException{

        {if (cardNumber % 2 == 0 && cardNumber < 10000 && moneyAmount < 0 &&
                ownerPersonalNumber.length() != 11)
        {
            throw new NotValidCardException("Please enter wright card information");
        }
            this.cardNumber = cardNumber;
            this.moneyAmount = moneyAmount;
            this.ownerPersonalNumber = ownerPersonalNumber;
        }
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) throws NotValidCardException{
        if (cardNumber % 2 == 0 && cardNumber < 10000 ){
            throw new NotValidCardException("Please enter correct something");
        }
    }  {
        this.cardNumber = cardNumber;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) throws NotValidCardException{
        if (moneyAmount < 0){
            throw new NotValidCardException("Please enter natural number");
        }
    } {
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerPersonalNumber() {
        return ownerPersonalNumber;
    }

    public void setOwnerPersonalNumber(String ownerPersonalNumber) throws NotValidCardException{
        if (ownerPersonalNumber.length() != 11){
            throw new NotValidCardException("Personal number must be 11 character");

        }
    } {
        this.ownerPersonalNumber = ownerPersonalNumber;
    }


    public double deposit(double number) throws NotValidOperationException{
        if (number < 0){
            throw new NotValidOperationException("Please enter number which will be >0");
        }
        return   moneyAmount = moneyAmount + number;
    }

    public double withdraw(double amount) throws NotValidOperationException {
        if (amount < 0){
            throw new NotValidOperationException("Please enter number which well be >0");
        }
        return moneyAmount = moneyAmount - amount;
    }


}
