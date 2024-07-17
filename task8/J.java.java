class Passport{

static String cprLoc;
static int dcdrLoc;
static String surNm;
static String givenNm;
static String db;
static String eml;
static boolean iseMailSame;
static String lgnId;
static String passWord;
static String cnfrPwd;
static String hntQues;
static String hntAns;
static String cpth;

//method 
public static boolean createPassPort(String cprLocation, 
int dcdrLocation, String surName, String givenName, String dob,
 String email, boolean isEmailLoginSame, String loginId, 
 String pwd, String confirmPwd, String hintQuestion, 
 String hintAns,String captcha)
 {
 System.out.println("The createPassPort() started:..");
 boolean isPassPortCreated = false;
 if(cprLocation!=null && dcdrLocation!=null && surName!=null && givenName!=null &&  dob!=null && email!= null && 
 isEmailLoginSame!=false && loginId!=null && pwd!= nll &&confirmPwd!=null &&hintQuestion!=null &&hintAns!=null && captcha!= null){
 
 cprLoc = cprLocation;
 dcdrLoc = dcdrLocation;
 surNm = surName;
 givenNm = givenName;
 db = dob;
 eml = email;
 iseMailSame = isEmailLoginSame;
 lgnId = loginId;
 passWord = pwd;
 cnfrPwd = confirmPwd;
 hntQues = hintQuestion;
 hntAns = hintAns;
 cpth = captcha;
 isPassPortCreated=true;
 System.out.println("passport Cretaed..");
 } else {
	 System.out.println("give proper details");
 }
 
 return isPassPortCreated;
 
 }
 
 
 public static void getPassPortDetails(){
 
System.out.println("The cpr location is:"+cprLoc);
System.out.println("The dcdr loaction is:"+dcdrLoc);
System.out.println("The sur Name is:"+surNm);
System.out.println("Given Nmae is:"+givenNm);
System.out.println("Date of Birth:"+db);
System.out.println("Email ID:"+eml);
System.out.println("Is email available:"+iseMailSame);
System.out.println("Id of  login  "+lgnId);
System.out.println("Password:"+ passWord);
System.out.println("Confirm Password:"+cnfrPwd);
System.out.println("hint question is :"+hntQues);
System.out.println("Hint answer is:"+hntAns);
System.out.println("capcha is:"+cpth);

 if	(dcdrLocation > 0 ){
                   dcdrLoc       =  dcdrLocation ;
				    isDcdrLocationValid = true;
			 }else{
				    System.out.println("Please provide valid dcdrLocation");
			 }			  
			if(surName != null)	 {
					 surNm         =  surName ;
					      isSurNameValid = true ;
		   }else{
				    System.out.println("Please provide valid Sur Name");
			 }	
		   if( isEmailLoginSame != false){
			         isEmailLoginSm     = isEmailLoginSame;
			      isEmailLoginSameValid = true ;
		   }else{
				    System.out.println("Please provide valid isEmailLoginSame value ");
			 }	
			    if( givenName != null){
			         givenNm     = givenName;
			      isGivenNameValid = true ;
		   }else{
				    System.out.println("Please provide valid isEmailLoginSame value ");
			 }	
		
		     if(isDcdrLocationValid && isEmailLoginSameValid && isSurNameValid && isGivenNameValid){
					   isPassportDataCreated  =true;
               }

}

}