class Insta{
	static String emlId;
	static long mblNum;
	static boolean wantSuggestion;
	static String dob;
	static String pwd;

public static boolean 	createInstaaccount(String emailId, long mobileNumber, boolean doYouWantSuggestions, String dateOfBirth, String Password ){
	boolean isInstaAccountCreated=false;
	boolean isEmlId=false;
	boolean isMblNum=false;
	boolean isWantSuggestion=false;
	boolean isDateOfBirth=false;
	boolean isPassWord=false;
	System.out.println("The insta Account creation started..");
	if(emailId != null){
	emlId = emailId;
	isEmlId = true;
	isInstaAccountCreated = true;
	}
	else{
	System.out.println("Provide valid email Id");
	isEmlId = true;
	}
	if(mobileNumber > 0){
	mblNum = mobileNumber;
	isMblNum = true;
	isInstaAccountCreated = true;
	}
	else{
	System.out.println("Provide valid mobile Number");
	return isMblNum;
	
	}
	if(doYouWantSuggestions != false){
	wantSuggestion = doYouWantSuggestions;
	isWantSuggestion = true;
	isInstaAccountCreated = true;
	}
	else{
	System.out.println("Provide valid value in terms of Yes or No");
	return isWantSuggestion ;
	
	}
	
	if(dateOfBirth != null){
	dob = dateOfBirth;
	isDateOfBirth = true;
	isInstaAccountCreated = true;
	}
	else{
	System.out.println("Provide valid date Of Birth");
	return isDateOfBirth;

	}
	
	if(Password != null){
	pwd = Password;
	isPassWord = true;
	isInstaAccountCreated = true;
	}
	else{
	System.out.println("Provide valid password");
	return isPassWord ;

	}
	System.out.println("The insta Account  creation is  ended..");
	return isInstaAccountCreated;
	}
	public static void getInstaAccount(){
	System.out.println("Email Id of User is:"+emlId);
	System.out.println("Mobile Number is :"+mblNum);
	System.out.println("Do Do Wish To Have Friends Suggestion to follow:"+wantSuggestion);
	System.out.println("Date Of Birth ;"+dob);
	System.out.println("Password :"+pwd);
	}

}