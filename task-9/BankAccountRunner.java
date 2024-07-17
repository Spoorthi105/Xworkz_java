class BankAccountRunner{
	public static void main(String fetch[]){
		System.out.println("main started");
		BankAccount.credit(500.00);
		BankAccount.getBalance();
		BankAccount.credit(100.0);
		BankAccount.getBalance();
		BankAccount.credit(0.00);
		BankAccount.getBalance();
		BankAccount.debit(500000.00);
		BankAccount.getBalance();
		System.out.println("main ended");

}
}