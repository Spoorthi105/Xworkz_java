class PassportFunRunner{
	public static void main(String prnr[])
	{
		boolean isPassPortValidation	= Passport.createPassPort("spoorthi",0,"shetty", "spoorthi","28/1/2000", "spoo123@gmail.com",true,"123456dfg","123gh", "23ghj","fav per", "CAt","AwSde");
		if(isPassPortValidation == true){
			Passport.getPassPortDetails();
		}
	}

}