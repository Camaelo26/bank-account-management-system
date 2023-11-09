package Bankmanagementfinal;

import java.util.Random;

/** child class DebitAccount of class Account that extends the class Account have 4  methods */
public class DebitAccount extends Account {
	/* method Debitaccount that has two arguments beginning balance and account number and set them */
    public DebitAccount(double beginningBalance,double AccountNumber) {
        Random rand = new Random();
        this.beginningBalance = rand.nextDouble(1001000) - 50000; // Generate random balance between -10000 and 1000000
        this.finalBalance = this.beginningBalance + beginningBalance; // set final balance
        this.AccountNumber = rand.nextInt(1001000000); // Generate random account number 
    }
    /* method deposit that has amount as attribute  and return final balance*/
    public double deposit(int amount) {
        finalBalance += amount;
        return finalBalance;
    }
    /* method withdraw that has amount as attribute and verify if the amount of 
     * withdraw is not more than the actual amount in the account to avoid the 
     * customer to withdraw more money than he has in his account  and return final balance*/
    public double withdraw(int amount) {
    	//if final balance is lower and equal to 0 let the customer know he does not have enough money to withdraw
    	if (finalBalance <= 0) {
    		System.out.println("\u001B[31m"+" You do not have enough money in your account, please make a deposit"+"\u001B[0m");
    	}
    	else {
    		// if statement that return final balance - amount if withdraw accepted
    		if (finalBalance >= amount) {
                finalBalance -= amount;
    	}	//else if he has money in his account but he want to withdraw more than he has let the customer know
    		else {
        		System.out.println("\u001B[31m"+"The amount you are trying to withdraw is over your balance."+"\u001B[0m");

    		}
        }
    	
        return finalBalance;// return final balance
    }
    /* method boolean passwordcheck that has password as attribute amount 
     * and check if password meets all the requirements and return it */
    public boolean passwordcheck(String password) {
    	boolean check = false;// boolean check set to false
    	// check if password lenght is more than 5 
    	if (password.length() > 5) 
    	{
    		//check if password lenght is more than 5 and has a digit in it 
    		if (password.matches(".*\\d.*")) 
    		{
    			//check if password lenght is more than 5 and has a digit in it and has capital letter and set check to true
    			if (password.matches(".*[A-Z].*")) 
    			{
    			  	check = true ;
    			}
    	  	}
    	 }
    	return check;// return check
    }
        
}
