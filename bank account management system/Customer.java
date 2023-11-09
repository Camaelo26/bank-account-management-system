package Bankmanagementfinal;

/** class Customer that implement Maintenance interface*/
public  class Customer implements Maintenance {
	private int accountID;// account ID 
    private String name;//  String name
    
    /* customer method with two args (account Id and name)that set account ID to  args account id and name to  args name*/
    public Customer(int accountID, String name) {
        this.accountID = accountID;
        this.name = name;
    }
    /*method that return accountID*/
    public int getAccountID() {
        return accountID;
    }
    /*method that return name*/
    public String getName() {
        return name;
    }
    /*override method firstmessage of interface maintenance that print a message*/
	@Override
	public void firstmessage() {
		// TODO Auto-generated method stub
		System.out.println("PLEASE FOLLOW ALL OF THE COMMANDS FOR ANY OPERATIONS YOU WOULD LIKE TO DO.");
	}
	/*override method secondmessage of interface maintenance that print a message*/
	@Override
	public void secondmessage() {
		// TODO Auto-generated method stub
		System.out.print(" THANK YOU FOR USING OUR SERVICE .");
	}
			
}
