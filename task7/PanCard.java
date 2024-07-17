class PanCard{
static String namePer;
static long aadharNo;
static boolean isCitizenOfInd;
static long mobileNo;
static String acNo;

public static boolean createPan(String namePerson, long aAdharNumber, boolean isCitizenOfIndia, long mobileNumber, String accountNumber){

//iniit from parameter variables to static variable if both are same it craete a conflict and compiler gives peference to the local variables than the global
boolean isoncreated=false;
namePer=namePerson;
aadharNo=aAdharNumber;
isCitizenOfInd=isCitizenOfIndia;
mobileNo=mobileNumber;
acNo=accountNumber;

return isoncreated;
}

 public static  void getPan(){
 System.out.println("person name is :"+namePer);
 System.out.println("aadhar number is:"+aadharNo);
 System.out.println("cityzen of India or not? :"+isCitizenOfInd);
 System.out.println("MObile number:"+mobileNo);
 System.out.println("Account Number:"+acNo);
 
 
 
 }
}