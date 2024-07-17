import java.util.*;

class Gym{
	static int index;
	static String Eqipments[] = {null, null, null, null, null, null, null, null,};
	public static boolean createGymEquipment(String equipment){
	boolean isGymCreated=false;
		System.out.println("createGymEquipment has started");
			if(equipment != null){
				Eqipments[index] = equipment;
				index++;
				isGymCreated = true; 
			}
			else{
				System.out.println("null value is invalid for the gym equipment");
				
			    }
		
		System.out.println("createGymEquipment has ended");
		return isGymCreated;
	}
	public static void getGymEquipments(){
	System.out.println("gym equipments avilable  here are ");
		for(String gymitem : Eqipments){
			System.out.println(gymitem);
		}
	}
	public static boolean updateGym(String oldGym, String newGym){
		boolean isUpdatestarted = false;
		System.out.println("updateGym is started...");
		for(index=0; index < Eqipments.length; index++){
			if( oldGym == Eqipments[index]){
				Eqipments[index] = newGym;
				isUpdatestarted = true;
				
			}
			
		}
		if(isUpdatestarted==false)
		{
		System.out.println("The gym name is not proper to update..");
		}
	
		System.out.println("updateGym is ended...");
		return isUpdatestarted;
		
		
	}
	public static boolean deleteGymEquipment(String deleteEqipment){
		int oldIndex,newIndex;
		boolean isGymEquipmentsDeleted=false;
		System.out.println("deleteGymEquipment started");
		for(oldIndex=0, newIndex=0; oldIndex < Eqipments.length; oldIndex++ ){
			if( Eqipments[oldIndex] != deleteEqipment ){
				Eqipments[newIndex] = Eqipments[oldIndex];
				newIndex++;
				
			}
			
		}
		Eqipments = Arrays.copyOf(Eqipments, newIndex);
			if(Eqipments != null){
			isGymEquipmentsDeleted=true;
		}
		
		if(isGymEquipmentsDeleted==false)
			System.out.println(deleteEqipment+"not found");
		
		
		System.out.println("deleteGymEquipment ended");
		
	return isGymEquipmentsDeleted;	
	}
		
}