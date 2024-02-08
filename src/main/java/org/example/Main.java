package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("josue", Bank.Gender.Female,10000);
        b1.deposit(10000);
        System.out.println(b1.MY_BANK_MONEY);
        System.out.println(b1.withdraw(100000));
        b1.displayUserInfo();
    }
}