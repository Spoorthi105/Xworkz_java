class SimRunner{
	public static void main(String[] simcards){
	Sim ref1 = new Sim();
	Sim ref2 = new Sim();
	Sim ref3 = new Sim();
	Sim ref4 = new Sim();
	Sim ref5 = new Sim();
	Sim ref6 = new Sim();
	Sim ref7 = new Sim();
	Sim ref8 = new Sim();
	Sim ref9 = new Sim();
	Sim ref10 = new Sim();
	ref1.name="Airtel";
	ref2.plan="2months";
	ref3.price=499;
	ref4.qntity=1;
	ref5.isFourG_orNot=true;
	ref6.network="5G";
	ref7.basePalncost=59;
	ref8.isAutoRoaming=true;
	ref9.ratings=5;
	ref10.anyComplaint="no";
	System.out.println("Name of cell"+ref1.name);
	System.out.println("weight:"+ref2.plan);
	System.out.println("quality:"+ref3.price);
	System.out.println("quantity:"+ref4.qntity);
	//System.out.println("price:"+ref5.price);
	System.out.println("validity"+ref5.isFourG_orNot);
	System.out.println("expiry date"+ref6.network);
	System.out.println("ratings:"+ref7.basePalncost);
	System.out.println("Is available in India:"+ref8.isAutoRoaming);
	System.out.println("price out of India:"+ref9.ratings);
	System.out.println("any complaints:"+ref10.anyComplaint);
	
	}


}

