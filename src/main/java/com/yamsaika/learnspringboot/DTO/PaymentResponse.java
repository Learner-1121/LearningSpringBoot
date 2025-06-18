package com.yamsaika.learnspringboot.DTO;

public class PaymentResponse {
    private long Id;
    private String currency;
    private double paymentAmount;

    public long getPaymentId() {
        return Id;
    }

    public void setPaymentId(long id) {
        Id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
