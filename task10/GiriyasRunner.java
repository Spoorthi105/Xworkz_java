class GiriyasRunner{
	public static void main(String[] giriyasItems){
		boolean isAppliancesAdded = Giriyas.createHomeAppliance("Refrigerator");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Air Conditioner");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Washing Machine");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Dryer");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Dishwasher");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Microwave Oven");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Fan");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Toaster");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Blender");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Vacuum Cleaner");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Iron");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Giriyas.createHomeAppliance("Coffee Maker");
		System.out.println("the item added is:"+isAppliancesAdded);
		Giriyas.getHomeAppliances();
		
		
		boolean newUpdatedInGiriyas = Giriyas.updateAppliances("Iron", "LapTop");
		System.out.println("The updated appliance list is.......:"+newUpdatedInGiriyas);
		Giriyas.getHomeAppliances();
		
		boolean isAppliancesDeleted = Giriyas.deleteAppliances("Air Conditioner");
		System.out.println(isAppliancesDeleted);
		Giriyas.getHomeAppliances();
	}
}



//error




















