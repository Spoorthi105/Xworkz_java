class InstaRunner{
public static void main(String instacreate[]){
boolean isInstaAccountValid = Insta.createInstaaccount("anjali@gmail.com", 9517534628L, false, "12/7/2001" , "Anj@123");
if(isInstaAccountValid = true){
	Insta.getInstaAccount();
}
else{
	System.out.println("insta Acount is not valid");
}
}
}