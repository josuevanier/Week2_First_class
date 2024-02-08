package org.example;
public class Bank {
    double salary;
    String name;
    static  int MY_BANK_MONEY =  1000000;
    Gender gender;
    int withdraw(int value){
        if(value <= MY_BANK_MONEY &&  value != 0 ){
            MY_BANK_MONEY -= value;
            return value;
        }else {
            System.out.println("You are broke");
            return 0;
        }
    }
     void deposit(int value){
        if(salary >= value && value != 0){
            MY_BANK_MONEY += value;
        }
      else {
            System.out.println("BROKE");
        }
     }

     public Bank(String name,Gender gender ,double salary){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
     }
     public void displayUserInfo(){
         String msg  = "";
         msg += this.gender == Gender.Male ? "Mr." + this.name + " " + "welcome" : "Ms." + this.name + " " + "welcome";
         System.out.printf("%s | account balance : %d", msg, MY_BANK_MONEY);
     }
     public enum Gender{
        Male, Female
    }
}
