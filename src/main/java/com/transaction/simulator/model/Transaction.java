package com.transaction.simulator.model;

public class Transaction {
    
    public String transactionID;
    public double amount;
    public String currency;
    public String timestamp;
    public Party payer;
    public Party payee;


    // TODO 1: Create a constructor that initializes all the fields

    public Transaction(String transactionID, double amount, String currency, String timestamp,Party payer, Party payee){
        this.transactionID = transactionID;
        this.amount=amount;
        this.currency=currency;
        this.timestamp=timestamp;
        this.payer=payer;
        this.payee=payee;
    }

    // TODO 2: Add getter methods for each field
    public String getTransactionId(){
        return transactionID;
    }

    public double getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }

    public String getTimestamp(){
        return timestamp;
    }

    public Party getPayer(){
        return payer;
    }

    public Party getPayee(){
        return payee;
    }
    // Example: public String getTransactionId() { return transactionId; }

    // TODO 3: Add setter methods for each field
    // Example: public void setTransactionId(String id) { this.transactionId = id; }
    public void setTransactionId (String id){
        this.transactionID=id;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public void setCurrency(String currency){
        this.currency=currency;
    }

    public void setTimestamp(String timestamp){
        this.timestamp=timestamp;
    }

    public void setPayer(Party payer){
        this.payer = payer;
    }

    public void setPayee(Party payee){
        this.payee=payee;
    }
    // TODO 4: Override the toString() method to display the transaction nicely
    @Override
    public String toString(){
        return "Transaction{" +
        "transactionId='" + transactionID + '\'' +
        ", amount=" + amount +
        ", currency='" + currency + '\'' +
        ", timestamp='" + timestamp + '\'' +
        ", payer=" + payer +
        ", payee=" + payee +
        '}';
    }

}
