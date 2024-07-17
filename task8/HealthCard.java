class HealthCard{
public static  boolean crateHealthcard(boolean isbenificiaryLogin , boolean isOperator,
 long mobileNumber, boolean isAadharlinked, boolean isEKYCDone){
boolean isHealthCardCreated=false;
 System.out.println("login by adding your name:"+isbenificiaryLogin);
System.out.println("are you an operator :"+isOperator);
System.out.println("MObile NUmber:"+mobileNumber);
System.out.println("Aadhar linked or not:"+isAadharlinked);
System.out.println("e kyc done?"+isEKYCDone);

return  isHealthCardCreated;
}

}