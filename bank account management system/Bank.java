package Bankmanagementfinal;
import java.util.Scanner;




/** class bank that manages all of the other classes and allow customer to manages everything allowed to him at the bank*/
public class Bank {
	 public static void main(String[] args) {
		 //try which allows us to create an exception if the user made a wrong input instead of crashing the code
		 try (
				 
				 
				// Create a scanner object to read user input	 
				Scanner input = new Scanner(System.in)) {
				System.out.println("WELCOME TO TEXAS TECH UNIVERSITY BANK ");// print a Welcome message
				
				// Prompt the user for the account number and name
				System.out.print("Enter your general account ID (only numbers): ");
				int accountID = input.nextInt();// create an input for account ID
				input.nextLine(); // print the account ID
				System.out.print("Enter name: ");
				String name = input.nextLine();// create an input  name

				// Create an object customerinfo of customer class  with the specified account number and name
				Customer customerinfo = new Customer(accountID, name);
				
				// Retrieve the account number and name of the bank account
				int myAccountID = customerinfo.getAccountID();
				String myName = customerinfo.getName();

				// Print out the account number to verify it is  correct and a welcome message with the name 
				System.out.println("Account ID: " + myAccountID);
				System.out.print("MR/MS " +"\u001B[33m"+ myName.toUpperCase()+"\u001B[0m"+" ");
				customerinfo.firstmessage();
				
				
				// create a debitaccount and creditaccount objects
				DebitAccount debit = new DebitAccount(0,0);
				CreditAccount credit = new CreditAccount(0,0);
				
			
				boolean pwcheck = false;// boolean pwcheck set  to false
				/* Asks the customer to enter a password that meeets the criteria if not it is going to ask him to try again*/
				while(!pwcheck)
				{
					System.out.print("Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): ");
				    String password = input.nextLine();//create an input password to allow the user to input his password
				    // if password meet criterias say Welcome in and move to the other part
				    if (debit.passwordcheck(password)) {
				    	System.out.println("WELCOME IN");
				    	pwcheck=true;
				    }
				    // else say password incorrect  and ask him to try again
				    else {
				    	System.out.println("\u001B[31m"+"Password incorrect try again"+"\u001B[0m");
				    	
				    }
				}
				
				
				
				
				//print a message and instructions to the customer
				System.out.println("What type of account do you want to use?");
				System.out.println("1.debit account ");
				System.out.println("2.credit account ");
				int choice = input.nextInt(); // input choice to read user choice either 1 or 2
				// if choice is 1 go to debit account print the customer account number asks user for some instructions like check balance make a deposit or withdraw money
				if(choice==1) {
					// print debit account number
					System.out.println("Account number : " +"\u001B[33m"+debit.getAccountNumber()+"\u001B[0m");
					boolean quit = false;// create a boolean false
					// while loop to allow user to have multiple operations until he choose to quit
					while (!quit) {
				    // Ask the user what they want to do
						System.out.println("What would you like to do?");
						System.out.println("1. Check balance");
						System.out.println("2. Make a deposit");
						System.out.println("3. Withdraw money");
						System.out.println("4. Quit");
						int choice1 = input.nextInt();// input choice1 to allow user to input his choice
						// Perform the appropriate action based on the user's choice like check balance ,deposit , withdraw or quit 
						switch (choice1) {
							case 1:
								System.out.println("Your balance is: $" +"\u001B[33m"+ debit.getFinalBalance()+"\u001B[0m");
								break;
							case 2:
								System.out.println("How much would you like to deposit?");
								int amount = input.nextInt();
								debit.deposit(amount);
								System.out.println("Your new balance is: $" +"\u001B[33m" +debit.getFinalBalance()+"\u001B[0m");
								break;
							case 3:
								System.out.println("How much would you like to withdraw?");
								int withdrawAmount = input.nextInt();
								debit.withdraw(withdrawAmount);
								System.out.println("Your new balance is: $" +"\u001B[33m"+ debit.getFinalBalance()+"\u001B[0m");
								break;
							case 4:
								System.out.print("GOOD BYE MR/MS  "+"\u001B[33m"+myName.toUpperCase()+"\u001B[0m"+" ");
								customerinfo.secondmessage();
								quit = true;
								break;
							default:
								System.out.println("\u001B[31m"+"Invalid choice"+"\u001B[0m");
								break;
				    }
				}
				
				
				
   }
				// else if choice is 2 go to credit account
				// print the customer account number asks user for some instructions like check credit or make a payment
				else if (choice==2) {
					// print the credit account number
					System.out.println("Account number : " +"\u001B[33m" +credit.getAccountNumber()+"\u001B[0m");
					boolean quit = false;
					// while loop to allow user to have multiple operations until he choose to quit
				    while (!quit) {
				    	
				    	
				        // Ask the user what they want to do
				        System.out.println("What would you like to do?");
				        System.out.println("1. Check credit balance");
				        System.out.println("2. Make a payment");
				        System.out.println("3. Quit");
				        int choice2 = input.nextInt();// input that allow use to make his choice

				        // Perform the appropriate action based on the user's choice
				        switch (choice2) {
				            case 1:
				                System.out.println("Your credit is: $" +"\u001B[33m"+ credit.getFinalBalance()+"\u001B[0m");
				                break;
				            case 2:
				                System.out.println("How much would you like to pay ?");
				                int amount = input.nextInt();
				                credit.payment(amount);
				                System.out.println("Your new credit is: $" +"\u001B[33m" +credit.getFinalBalance()+"\u001B[0m");
				                break;
				            case 3:
				            	System.out.print("GOOD BYE MR/MS  "+"\u001B[33m"+myName.toUpperCase()+"\u001B[0m"+" ");
					            customerinfo.secondmessage();
				                quit = true;
				                break;
				            default:
				                System.out.println("\u001B[31m"+"Invalid choice"+"\u001B[0m");
				                break;
				        }
				    }
				}
			}
		 catch(Exception e) {
			 System.err.println(" wrong input, please try again");
			 
		 }
	 }
	 
}

