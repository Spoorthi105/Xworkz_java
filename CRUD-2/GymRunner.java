class GymRunner{
	 public static void main(String[] gymnastics){
		System.out.println("Main method started");
		boolean isEquipmentsAdded = Gym.createGymEquipment("ThreadMill");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Stationary Bike");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Elliptical Trainer");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Resistance Bands");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Dumbbells");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Barbell");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Rowing Machine");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		isEquipmentsAdded = Gym.createGymEquipment("Leg Press Machine");
		System.out.println("The added equipment is:"+isEquipmentsAdded);
		Gym.getGymEquipments();
		
		
		boolean isGymUpdatedWithName = Gym.updateGym("ThreadMill", "StoneWeight");
		System.out.println("The updated name is:"+isGymUpdatedWithName);
		Gym.getGymEquipments();
		
		boolean isGymEquipmentDeleted = Gym.deleteGymEquipment("Stationary Bike");
		System.out.println(isGymEquipmentDeleted);
		Gym.getGymEquipments();
		
		System.out.println("Main method ended");
	 }

}


