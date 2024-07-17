import java.util.*;

class GoldShop{
	static int  index;
	static String[] attributes = {null, null, null, null, null, null, null };
	
	public static boolean attribute(String diffAttributes){
		boolean isGoldShopCreated=false;
	System.out.println("addGoldItem started............");
			if(attributes != null){
				attributes[index] = diffAttributes;
				index++;
				isGoldShopCreated=true;
			}
			else{
				System.out.println("null value cant be added as attributes");
			}
	System.out.println("addGoldItem started............");
	return isGoldShopCreated;
	}
	
	public static void  getGoldShopDetails(){
		for(String attribute: attributes)
			System.out.println("The diffAttributes od gold  are:"+attribute);
		return ;
	}
	
	public static boolean updateGoldShopAttrubutes(String oldAttribute, String newAttribute){
		boolean isUpdateAttributes=false;
			System.out.println("updateGoldShopAttrubutes started");
			for(index=0; index < attributes.length; index++){
				if(attributes[index]==oldAttribute){
				oldAttribute=newAttribute;
				isUpdateAttributes=true;
				}
			}
			if(isUpdateAttributes==false){
			System.out.println("the provided attribute is not exist in old attribute, ....");
			}
	
			System.out.println("updateGoldShopAttrubutes ended");
		return isUpdateAttributes;
	
	}
	
	//delete 
	public static boolean deleteGoldShopAttrubutes(String GoldShopAttrubutesToBeDeleted){
		int newIndex,oldIndex;
		boolean isdeleteGoldShopAttrubutes=false;
		System.out.println("The deleteGoldShopAttrubutes started ");
		for(newIndex=0,oldIndex=0; oldIndex < attributes.length; oldIndex++ ){
			if(attributes[oldIndex]!= GoldShopAttrubutesToBeDeleted){
				oldIndex=newIndex;
				newIndex++;
			}
			
		}
		attributes = Arrays.copyOf(attributes, newIndex);
		if(attributes != null){
			isdeleteGoldShopAttrubutes=true;
		}
		if(isdeleteGoldShopAttrubutes=false){
			System.out.println(attributes+"not found");
		}
		
		
		
		
		System.out.println("The deleteGoldShopAttrubutes ended ");
		return isdeleteGoldShopAttrubutes;
	}
	
}