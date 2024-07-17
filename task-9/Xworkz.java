class Xworkz{
static String firstName;
static String lastName;
static String dob;
static long mblNumber;
static String pwd;

	public static boolean createXworkzAccount(String f_name, String l_Name, String dateOfBirth, long mobileNumber, String passWord){
	boolean isXworkzAccountCreated=false;
	boolean isFirstName=false;
	boolean isLastName=false;
	boolean isDateOfBirth=false;
	boolean isMobileNumber=false;
	boolean isPassword=false;
	System.out.println("The Account creation has started");
	
	if(f_name != null){
	firstName = f_name;
	isFirstName = true;
	isXworkzAccountCreated = true;
	
	}else{
	System.out.println("provide the valid First Name");
	return isFirstName;
	}
	
	if(l_Name != null){
	lastName = l_Name;
	isLastName = true;
	isXworkzAccountCreated = true;
	
	}else{
	System.out.println("provide the valid last Name");
	return isLastName;
	}
	
	if(dateOfBirth != null){
	dob = dateOfBirth;
	isDateOfBirth = true;
	isXworkzAccountCreated = true;
	
	}else{
	System.out.println("provide the Date Of Birth");
	return isDateOfBirth;
	}
	
	if(mobileNumber > 0){
	mblNumber = mobileNumber;
	isMobileNumber = true;
	isXworkzAccountCreated = true;
	
	}else{
	System.out.println("provide the valid Mobile Number");
	return isMobileNumber;
	}
	
	if(passWord != null){
	pwd = passWord;
	isPassword = true;
	isXworkzAccountCreated = true;
	
	}else{
	System.out.println("provide the valid Password");
	return isPassword;
	}
	
	
	System.out.println("The Account creation has ended");
	return isXworkzAccountCreated;
	}
	public static void getXworzAccount(){
		System.out.println("the firstName is : "+firstName);
		System.out.println("The last Name is : "+lastName);
		System.out.println("Date of Birth is : "+dob);
		System.out.println("Mobile Number :"+mblNumber);
		System.out.println("passWord is : "+pwd);
	
	
	}

}