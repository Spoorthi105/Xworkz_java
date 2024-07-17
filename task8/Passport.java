class Passport{
public static boolean createPassPort(String cprLocation, 
int dcdrLocation, String surName, String givenName, String dob,
 String email, boolean isEmailLoginSame, String loginId, 
 String pwd, String confirmPwd, String hintQuestion, 
 String hintAns,String captcha)
 {
 boolean isPassPortCreated = false;
 
 
System.out.println("The cpr location is:"+cprLocation);
System.out.println("The dcdr loaction is:"+dcdrLocation);
System.out.println("The sur Name is:"+surName);
System.out.println("Given Nmae is:"+givenName);
System.out.println("Date of Birth:"+dob);
System.out.println("Email ID:"+email);
System.out.println("Is email available:"+isEmailLoginSame);
System.out.println("Id of  login  "+loginId);
System.out.println("Password:"+pwd);
System.out.println("Confirm Password:"+confirmPwd);
System.out.println("hint question is :"+hintQuestion);
System.out.println("Hint answer is:"+hintAns);
System.out.println("capcha is:"+captcha);
return isPassPortCreated;
}

}