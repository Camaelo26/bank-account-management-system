# bank-account-management-system
We are going to be creating a bank account management system that implements an account class that represents a bank account, a bank class that manages accounts, and a customer class that represents a bank customer. We used inheritance and encapsulation to ensure that only authorized users can access the accounts. We learned the different aspects of what it takes to create and optimize a bank account management system. We had to decide what would be necessary and what would be extra features that would not be utilized or would make the system less optimal. We had to come together and brainstorm what features we can add and or replace to make the account management system run better and bring easier to use products to the bank customers. We had to make the bank account management system is secure and efficient enough for the bank branches to use, but not so complex that it would become so hard or inconvenient for prospective customers to be able to utilize it. 
Our program bank management is a program that helps a customer manage his accounts through the bank. First, it asks him for his General ID which is only numbers to be inputted, then it asks for the customer’s name and return a message. After those steps, it asks the user for its passwords and it must meet some criteria if not he will not access his accounts, then after writing a password that met the criteria, it will ask him what accounts he wants to use debit or credit. After inputting his choice, it will display a random account number for the type of account chosen. If debit it will display a bunch of options (check balance, deposit, withdraw, quit), if he chooses to check balance it will display a random balance, and for deposit he will be asked to input an amount as the same for withdrawing and it will always show his final balance. He can do multiple operations until he wants to quit by inputting the choice related to quit. It is going to be the same if he chose a credit account except that in credit account, we have only three choices (check credit, make a payment, quit). After quitting it will display a Bye message, and it is over. Note that in the debit account, he cannot withdraw money if his balance is less than) or if the amount to be withdrawn is over his balance.
This system features 3 main classes account class, bank class, and customer class. The account class of the management system will be the father class of the credit and debt classes updating and holding the information about the bank customer’s account. The banking class will be where the bank customer interacts with the account. The customer information section will be how the bank members access their account and enter in and preview their personal information.  The final Bank Account Management System our team produced not only has the good mixture between performance, efficiency, and ease of use for not only customers, but also the banks that will be implementing our product using objects of different classes.
UML DIAGRAMS
Customer
AccountID
Name

Customer()
getAccountID()
getName()
firstmessage()
secondmessage()


DebitAccount
(Extends Account)
AccountNumber
beginningBalance
finalBalance
password
DebitAccount()
deposit()
withdraw()
passwordcheck()
Mantenance




firstmessage ()
secondmessage()

CreditAccount
(Extends Account)
AccountNumber
beginningBalance
finalBalance
password
CreditAccount()
payment()

Account 
AccountNumber
beginningBalance
finalBalance
password
getAccountNumber()
getBeginningBalance()
getFinalBalance()
getPassword()












REPORT PART 5 TEST RUNS AND THEIR OUTPUTS

INPUT for at least  5 test runs:

***First test run it respects every rules of the code

1- Accound Id input : 478559238
2- name input: Macarthur diby
3- password input : Camael1176
4 choice account input : 1 (which is debit account)
5-choice input for debit account: 1(check balance)
6- choice input for debit account : 2(make deposit)
7- input  the amount to be deposited : 9000
8-choice input for debit account: 3(withdraw money)
9- input  the amount to be withdraw : any number less than the balance
10-choice input for debit account : 4(quit).

***first output 


1- WELCOME TO TEXAS TECH UNIVERSITY BANK 
Enter your general account ID (only numbers): 478559238
Enter name: Macarthur diby
Account ID: 478559238
MR/MS Macarthur diby PLEASE FOLLOW ALL OF THE COMMANDS FOR ANY OPERATIONS YOU WOULD LIKE TO DO.
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): Camael1176
WELCOME IN
What type of account do you want to use?
1.debit account 
2.credit account 
1
Account number : 450742282
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
1
Your balance is: $873537.9632875549
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
2
How much would you like to deposit?
9000
Your new balance is: $882537.9632875549
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
3
How much would you like to withdraw?
90070
Your new balance is: $792467.9632875549
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
4
GOOD BYE MR/MS  Macarthur diby  THANK YOU FOR USING OUR SERVICE .


*** second test run  (problem with the password)

1- Accound Id input : 886967774
2- name input: Abena Poku
3- password input : Abena ( password must be more than 5 characters with one capital letter , one digit)
4- password input : 12678389( password must be more than 5 characters with one capital letter , one digit)
5- password input : abena7389( password must be more than 5 characters with one capital letter , one digit)
6-password input : Abena988
7-choice account input : 2 (which is credit account)
8- choice input for credit account: 1(check credit)
9- choice input for credit account: 2(make a payment)
10- input  the amount to be paid : 500
11-choice input for credit account : 3(quit).


***second output 

WELCOME TO TEXAS TECH UNIVERSITY BANK 
Enter your general account ID (only numbers): 88697774
Enter name: Abena Poku
Account ID: 88697774
MR/MS Abena Poku PLEASE FOLLOW ALL OF THE COMMANDS FOR ANY OPERATIONS YOU WOULD LIKE TO DO.
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): Abena
Password incorrect try again
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): 12678389
Password incorrect try again
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): abena7389
Password incorrect try again
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): Abena988
WELCOME IN
What type of account do you want to use?
1.debit account 
2.credit account 
2
Account number : 453010036
What would you like to do?
1. Check credit balance
2. Make a payment
3. Quit
1
Your credit is: $146875.0069876673
What would you like to do?
1. Check credit balance
2. Make a payment
3. Quit
2
How much would you like to pay ?
500
Your new credit is: $146375.0069876673
What would you like to do?
1. Check credit balance
2. Make a payment
3. Quit
3
GOOD BYE MR/MS  Abena Poku  THANK YOU FOR USING OUR SERVICE .


*** third test run  (problem with the amount to withdraw )

1- Accound Id input : 78878878
2- name input: Brian 
3- password input : Brian9900
4 choice account input : 1 (which is debit account)
5-choice input for debit account: 1(check balance)
6- choice input for debit account: 3(withdraw money)
7- input  the amount to be withdraw : amount> balance (The amount you are trying to withdraw is over your balance) no withdraw
8- choice input for debit account : 4(quit).

***Third Output


WELCOME TO TEXAS TECH UNIVERSITY BANK 
Enter your general account ID (only numbers): 78878878
Enter name: Brian
Account ID: 78878878
MR/MS Brian PLEASE FOLLOW ALL OF THE COMMANDS FOR ANY OPERATIONS YOU WOULD LIKE TO DO.
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): Brian9900
WELCOME IN
What type of account do you want to use?
1.debit account 
2.credit account 
1
Account number : 130104566
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
1
Your balance is: $994201.1054538067
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
3
How much would you like to withdraw?
995000
The amount you are trying to withdraw is over your balance.
Your new balance is: $994201.1054538067
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
4
GOOD BYE MR/MS  Brian  THANK YOU FOR USING OUR SERVICE .



*** fourth test run  (problem with withdrawing /account in overdraft )
1-Accound Id input : 78954622
2- name input: Mustafa 
3- password input : Mustafaoop23
4 choice account input : 1 (which is debit account)
5-choice input for debit account: 1(check balance) seeing balance is less than 0( since it generates a random balance between negative and positive one we will never know when it will appears)
6-choice input for debit account: 3(withdraw money)
7-input  the amount to be withdraw : any amount (no withdraw possible/, You do not have enough money in your account )
10- choice input for debit card: 4 (quit) 


***FOURTH OUTPUT

WELCOME TO TEXAS TECH UNIVERSITY BANK 
Enter your general account ID (only numbers): 78954622
Enter name: Mustafa
Account ID: 78954622
MR/MS Mustafa PLEASE FOLLOW ALL OF THE COMMANDS FOR ANY OPERATIONS YOU WOULD LIKE TO DO.
Enter your password (must be at least 5 characters and contain at least 1 capital letter and 1 digit): Mustafaoop23
WELCOME IN
What type of account do you want to use?
1.debit account 
2.credit account 
1
Account number : 242646880
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
1
Your balance is: $-9078746.194204425
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
3
How much would you like to withdraw?
90989
 You do not have enough money in your account, please make a deposit
Your new balance is: $-9078746.194204425
What would you like to do?
1. Check balance
2. Make a deposit
3. Withdraw money
4. Quit
4
GOOD BYE MR/MS  Mustafa  THANK YOU FOR USING OUR SERVICE .


*** 5th input (handle exceptions like error to avoid crash of the program if the customer input something wrong)
1- Accound Id input(only numbers) : Macarthur( wrong input)
2- Accound Id input(only numbers) : 123456789
3- name input: Macarthur
THEN FOLLOW OTHER INPUTS


***5th output

WELCOME TO TEXAS TECH UNIVERSITY BANK 
Enter your general account ID (only numbers): Macarthur
 wrong input, please try again
WELCOME TO TEXAS TECH UNIVERSITY BANK 
Enter your general account ID (only numbers): 123456789
Enter name: Macarthur
Account ID: 123456789
MR/MS Macarthur PLEASE FOLLOW ALL OF THE COMMANDS FOR ANY OPERATIONS YOU WOULD LIKE TO DO.

