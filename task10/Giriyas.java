/*create a class Girias which has array ref of homeAppliances{12}
methods to be implemented : createhomeAppliance -( it takes one String ref)*/
import java.util.*;

class Giriyas{
	static String appliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
static int index;
//create
	public static boolean createHomeAppliance(String appliance){
		boolean isCreateHomeAppliance=false;
		System.out.println("createHomeAppliance started");
			if(appliance != null){
				appliances[index] = appliance;
				index++;
				isCreateHomeAppliance = true;
			}
			else System.out.println("Null value can't consider as a appliance name");
		
		System.out.println("createHomeAppliance ended");
	return isCreateHomeAppliance;
	}
//read
	public static void getHomeAppliances(){
		for(String item : appliances)
			System.out.println("Appliances available here are:"+item);

	}
//update	
	public static boolean updateAppliances(String oldAppliance, String newAppliance){
		boolean isUpdateOfAppliances=false;
		System.out.println("updateAppliances started");
			for(index=0; index<appliances.length; index++){
				if(appliances[index]==oldAppliance){
					oldAppliance = newAppliance;	
					isUpdateOfAppliances=true;
				}
			}
			
			if(isUpdateOfAppliances==false)
				System.out.println("can't update this new appliance");
			
		System.out.println("updateAppliances endeded");	
		return isUpdateOfAppliances;
	}
	
	//delete appliance
	public static boolean deleteAppliances(String deleteAppliance){
		int newIndex,oldIndex;
		boolean isApplianceDeleted=false;
		System.out.println("deleteAppliance started");
		for(newIndex=0,oldIndex=0; oldIndex < appliances.length; oldIndex++ ){
			if(appliances[oldIndex]!= deleteAppliance){
				newIndex = oldIndex;
				newIndex++;
				
				
			}
		}
		appliances  = Arrays.copyOf(appliances, newIndex);
		
		if(appliances!= null){
		isApplianceDeleted=true;
		}
		
		if(isApplianceDeleted == false){
			System.out.println(appliances[newIndex]+"not deleted");	
		}
	
		System.out.println("deleteAppliance ended");
		return isApplianceDeleted;
	}

}