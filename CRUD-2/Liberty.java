import java.util.*;

class Liberty{
	static String shoeBrand[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addShoeBrand(String shoe){
		
		boolean isShoeAdded=false;
		if(index < shoeBrand.length){
			if(shoe != null){
				shoeBrand[index]=shoe;
				index++;
				isShoeAdded=true;
				
			}else{
			System.out.println("shoe name can't be null");
			}	
		}else{
			System.out.println("shoe brand name already full");
		}
	return isShoeAdded;	
	} 
	
public static void getAllShoeBrand(){
	for(String shoe : shoeBrand){
		System.out.println("available material are : "+shoe);
	}
	
}
public static boolean updateShoeBrand(String oldName,String newName){
	boolean isUpdated=false;
	for(int index=0;index<shoeBrand.length;index++){
		if(oldName==shoeBrand[index]){
			shoeBrand[index]=newName;
			isUpdated=true;
		}	
			
		if(isUpdated==false){
			System.out.println(oldName+" Not found");
			
		}
		return isUpdated;
	}
	
	
}

public static boolean DeleteShoebrand(String shoesBrandTobeDeleted){
	int newIndex,oldIndex;
	boolean isShoedeleted=false;
	System.out.println("DeleteShoebrand started");
		for(newIndex=0,oldIndex=0; oldIndex < shoeBrand.length; oldIndex++ ){
			if(shoeBrand[index]!= shoesBrandTobeDeleted ){
				shoeBrand[newIndex]=shoeBrand[oldIndex];
				newIndex++;
			}
		}
		shoeBrand = Arrays.copyOf(shoeBrand, newIndex);
		if(shoeBrand!= null){
			isShoedeleted=true;
			
		}
		if(isShoedeleted==false){
			System.out.println(shoesBrandTobeDeleted+"not found");
		}
	
	
	System.out.println("DeleteShoebrand ended");
	return isShoedeleted;
	
	
}
}
