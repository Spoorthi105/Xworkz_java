class AdharDetails{
public static boolean createAadhar(int applicationNumber, String dob, boolean isRationCard, boolean isAPL, String fatherName ){
boolean iscreated = false;
System.out.println("Application number is:"+applicationNumber);
System.out.println("Dtae Of Birth is :"+dob);
System.out.println("Ration card is available for recipient or not:"+isRationCard);
System.out.println("Whether the recipient belong to APL, if not considered as BPL :"+isAPL);
System.out.println("Father Name:"+fatherName);

return iscreated;
}

}