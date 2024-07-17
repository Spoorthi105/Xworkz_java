class XworkzRunner{
	
	public static void main(String xoWrks[]){
	 boolean isValidAccountCreated = Xworkz.createXworkzAccount(null , "B shetty", "03/08/2002", 9784651320L, "Keerthi@12345");
	 if(isValidAccountCreated = true){
		Xworkz.getXworzAccount();
	 }else{
		System.out.println("Enter the valid details");
	 }
	}
}