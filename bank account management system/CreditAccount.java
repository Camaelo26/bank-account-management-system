package Bankmanagementfinal;
import java.util.Random;

/** child class CreditAccount of class Account that extends the class Account have 2  methods */
public class CreditAccount extends Account {
	/* method Credit account that has two arguments beginning balance and account number and set them */
	public CreditAccount(double beginningBalance,int AccountNumber) {
        Random rand = new Random();
        this.beginningBalance = rand.nextDouble(1001000); // Generate random balance between -1000 and 1000000
        this.finalBalance = this.beginningBalance + beginningBalance; // set final balance
        this.AccountNumber = rand.nextInt(1001000000); // Generate random account number 
    }
	
	/* method payment that has amount as attribute and return final balance*/
	public double payment(int amount) {
		//if final balance is superior to amount final balance equal to final balance - amount
        if (finalBalance >= amount) {
            finalBalance -= amount;
        }
        return finalBalance;// return final balance
    }
	
}