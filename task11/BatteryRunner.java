class BatteryRunner{
	public static void main(String[] batteryruns){
	Battery ref1 = new Battery();
	Battery ref2 = new Battery();
	Battery ref3 = new Battery();
	Battery ref4 = new Battery();
	Battery ref5 = new Battery();
	Battery ref6 = new Battery();
	Battery ref7 = new Battery();
	Battery ref8 = new Battery();
	Battery ref9 = new Battery();
	Battery ref10 = new Battery();
	ref1.name="Duracell";
	ref2.weight=22;
	ref3.quality=1;
	ref4.qty=5;
	ref5.price=150;
	ref6.validity="2030";
	ref7.expDate="2024";
	ref8.ratings=4;
	ref9.isAvailableOutOfIndia=true;
	ref10.priceOutforIndia="250rs";
	System.out.println("Name of cell"+ref1.name);
	System.out.println("weight:"+ref2.weight);
	System.out.println("quality:"+ref3.quality);
	System.out.println("quantity:"+ref4.qty);
	System.out.println("price:"+ref5.price);
	System.out.println("validity"+ref6.validity);
	System.out.println("expiry date"+ref7.expDate);
	System.out.println("ratings:"+ref8.ratings);
	System.out.println("Is available in India:"+ref9.isAvailableOutOfIndia);
	System.out.println("price out of India:"+ref10.priceOutforIndia);
	
	}


}