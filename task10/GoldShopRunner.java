class GoldShopRunner{
	public static void main(String[] adding){
		System.out.println("main method started");
		boolean isGoldShopAdding = GoldShop.attribute("ShopName=GRT");
		System.out.println("First attributes added is"+isGoldShopAdding);
		isGoldShopAdding= GoldShop.attribute("Agmark=99");
		System.out.println("second attributes added is"+isGoldShopAdding);
		isGoldShopAdding= GoldShop.attribute("JwellaryType=Earings");
		System.out.println("third attributes added is"+isGoldShopAdding);
		isGoldShopAdding= GoldShop.attribute("GoldQuantity=250grms");
		System.out.println("Fourth attributes added is"+isGoldShopAdding);
		isGoldShopAdding= GoldShop.attribute("YearofDesign:2023");
		System.out.println("Fifth attributes added is"+isGoldShopAdding);
		isGoldShopAdding= GoldShop.attribute("fastDesign:yes");
		System.out.println("sixth attributes added is"+isGoldShopAdding);
		isGoldShopAdding= GoldShop.attribute("Secondchoosen:long chain");
		System.out.println("seventh attributes added is"+isGoldShopAdding);
		GoldShop.getGoldShopDetails();
		
		
		boolean isUpdateAddedin=GoldShop.updateGoldShopAttrubutes("ShopName=GRT","ShopName=Joy allucas");
		System.out.println(isUpdateAddedin);
		GoldShop.getGoldShopDetails();
		
		boolean isGoldShopItemDelated = GoldShop.deleteGoldShopAttrubutes("Agmark=99");
		System.out.println(isGoldShopItemDelated);
		GoldShop.getGoldShopDetails();
		
		System.out.println("main method ended");
	}



}