class Textiles{
	static index;
static String[] varitiesOfClothes={null, null, null, null,null,null,null,null,null,null,null,null,null,null };
	public static boolean addTextiles(String[] varities){
	System.out.println("add started");
	boolean isAddTextTiles=false;
			if(varitiesOfClothes != null){
			varitiesOfClothes[index]= varities;
			index++;
			isAddTextTiles=true;
			}
			else
			System.out.println("null value cant added to array");
	
	System.out.println("add ended");
	return isAddTextTiles;
}
	public static boolean getVaritiesOfClothes(){
	boolean isGetVarities=false;
		for(String var: varitiesOfClothes ){
		System.out.println("the varities of clothes are:"+var);
		}
return isGetVarities;	
}

	public static boolean updateVaritiesOfCloth(String old, String new){
	boolean isUpdateVaritiesOfCloth=false;
	System.out.println("Update started");
	for(index = 0; index<varitiesOfClothes.length; index++){
		if(varitiesOfClothes[index]== old ){
			old=new;
		}
	
	}
	if(isUpdateVaritiesOfCloth==false)
	System.out.println("entered old value is not exist");

	System.out.println("Update ended");
	return isUpdateVaritiesOfCloth;
	}
	public static boolean deleteTextile(String textileItemToBeDelated){
		int newIndex,oldIndex;
		boolean isTextileItemDeleted=false;
		System.out.println("deleteTextile started");
		for(oldIndex=0,newIndex=0; oldIndex<varitiesOfClothes.length; oldIndex++ ){
			if(varitiesOfClothes[oldIndex]== textileItemToBeDelated){
				         varitiesOfClothes[oldIndex]  = varitiesOfClothes[oldIndex];
			}
			
		}
		
		
		System.out.println("deleteTextile ended");
		
	}


}