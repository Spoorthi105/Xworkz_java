class AtmMachineRunner{
	public static void main(String[] atmrun){
		AtmMachine ref1= new AtmMachine();
		AtmMachine ref2= new AtmMachine();
		AtmMachine ref3= new AtmMachine();
		AtmMachine ref4= new AtmMachine();
		AtmMachine ref5= new AtmMachine();
		AtmMachine ref6= new AtmMachine();
		AtmMachine ref7= new AtmMachine();
		AtmMachine ref8= new AtmMachine();
		AtmMachine ref9= new AtmMachine();
		AtmMachine ref10= new AtmMachine();
	
	ref1.bankName="Canara";
	ref2.availbleamt=2500;
	ref3.withdraw=1500;
	ref4.cashTobeDeposited=3000;
	ref5.validity="2025";
	ref6.machineHeight=4.00;
	ref7.machineWeight=90.75;
	ref8.isSecurityAvailable=true;
	ref9.isCardLessTransactuonAvailable=false;
	ref10.numberOfBranches=10;
	System.out.println("bankName"+ref1.bankName);
	System.out.println("availbleamt:"+ref2.availbleamt);
	System.out.println("withdraw:"+ref3.withdraw);
	System.out.println("cashTobeDeposited:"+ref4.cashTobeDeposited);
	System.out.println("validity:"+ref5.validity);
	System.out.println("machineHeight:"+ref6.machineHeight);
	System.out.println("machineWeight:"+ref7.machineWeight);
	System.out.println("isSecurityAvailable:"+ref8.isSecurityAvailable);
	System.out.println("isCardLessTransactuonAvailable:"+ref9.isCardLessTransactuonAvailable);
	System.out.println("numberOfBranches:"+ref10.numberOfBranches);
	
	}


}