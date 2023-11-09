package Bankmanagementfinal;
/** abstract class Account that have 4 attributes and 4  methods */
public abstract class Account {
	  int AccountNumber;// attribute int account number
	  double beginningBalance;// attribute double beginning balance
      double finalBalance;// attribute double final balance
     String password; // attribute string password
     /* method that return the account number*/
     public int getAccountNumber() {
         return AccountNumber;
     }
     /* method that return the beginning balance*/
     public double getBeginningBalance() {
         return beginningBalance;
     }
     /* method that return the final password*/
     public double getFinalBalance() {
         return finalBalance;
     }
     /* method that return the password*/
     public String getPassword() {
    	return password; 
     }
     
}
