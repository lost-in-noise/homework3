package org.example;

public class BankAccount {
    public double balance;

    public void checkLimit() {
        if (this.balance < 100) {
            System.out.println("ბალანსი დაბალია: " + balance);
        } else {
            System.out.println("ბალანსი ნორმალურია: " + balance);
        }
    }
}
