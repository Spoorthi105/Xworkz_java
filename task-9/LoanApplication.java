class LoanApplication

{
	static long bankAccountNum;
	static String bName;
	static  int   cScore;
	static double rOfInterest;
	static String lType;
	public static boolean createLoanApplication(long bankAccountNumber, String bankName, int creditScore, double rateOfInterest, String loanType)
	{
		boolean isLoanApplicationCreated = false;
		boolean isbankAccountNum=false;
		boolean isBName=false;
		boolean isCScore=false;
		boolean isROfInterset=false;
		boolean isLType=false;
		System.out.println("Loan Application process is  started...");
		if(bankAccountNumber > 0 ){
			bankAccountNum = bankAccountNumber;
			isbankAccountNum = true;
			isLoanApplicationCreated = true;
			System.out.println("Your Bank account number validation is successfully");
	
		}else{
			System.out.println("Provide valid bank account number");
			return isbankAccountNum;
			
		}
		
		if(bankName !=  null){
			bName = bankName;
			isBName = true;
			isLoanApplicationCreated  = true;
			
		}else{
			System.out.println("Provide valid bank name");
			return isBName;
			
		}
		if(creditScore > 0){
			cScore = creditScore;
			isCScore = true;
			isLoanApplicationCreated = true;
			
		}
		else{
			System.out.println("Provide valid credit score");
			return isCScore;
			
		}
		if(rateOfInterest > 0.0){
			rOfInterest = rateOfInterest;
			isROfInterset = true;
			isLoanApplicationCreated = true;
		}
		else{
			System.out.println("Provide valid credit score");
			return isCScore;
		}
		if(loanType != null){
			lType  = loanType;
			isLType = true;
			isLoanApplicationCreated = true;
			
		}else{
			System.out.println("Provide valid Loan Type");
			return isLType;
		}
		
			System.out.println("Loan Application process is  started...");
		    
			return isLoanApplicationCreated;
	}
	
	public static void getLoanApplicationDetails(){
		System.out.println("Bank Account Number : "+bankAccountNum);
		System.out.println("Bank Name : "+bName);
		System.out.println("Bank Creditt Score: "+cScore);
		System.out.println("Loan rate of Interest : "+rOfInterest);
		System.out.println("Loan type : "+lType);
		
		return;
	}
	
		

}