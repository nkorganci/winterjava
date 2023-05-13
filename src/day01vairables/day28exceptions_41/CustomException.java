package day01vairables.day28exceptions_41;

import a02Review.general.Ex;

public class CustomException {
}

class NegativeBalanceException extends Exception   {
    private double balance;

    public NegativeBalanceException(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String getMessage(){
        return "Negative balance of "+ balance + " detected";
    }
}

class Example{

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 200;

        try{
            if (withdrawal>balance){
                throw new NegativeBalanceException(balance-withdrawal);
            }
            balance = balance-withdrawal;
            System.out.println("New Balance " + balance);
        }catch (NegativeBalanceException e){
            System.out.println("Error " + e.getMessage());
            System.out.println("Balance: " + e.getBalance());
        }
    }
}
