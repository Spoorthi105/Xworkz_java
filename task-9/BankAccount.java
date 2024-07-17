class BankAccount{
static double balance;

	public static void	debit(double amount){
		System.out.println("debit method started");
		if(amount <= balance)
		balance = balance - amount;
	    else
			System.out.println("insuffient balance....");
		System.out.println("debit method ended");
		return ;
	}
	
	public static void	credit(double amount){
		System.out.println("credit method started");
		if(amount>0)
		balance = balance + amount;
	    else
		System.out.println("cannot credit amount....");
		System.out.println("credit method ended");
		return;

	}
	
	public static double getBalance(){
	System.out.println("fetching bank details" +balance);
		return balance;
	}

}