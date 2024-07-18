class GardenRunner{
	public static void main(String[] runner){
		 Garden reg1  = new Garden();
		 Garden ref2 = new Garden();
		 Garden ref3  = new Garden();
		 Garden ref4 = new Garden();
		 Garden ref5 = new Garden();
		 Garden ref6 = new Garden();
		 Garden ref7 = new Garden();
		 Garden ref8 = new Garden();
		 Garden ref9 = new Garden();
		 Garden ref10 = new Garden();
		
		reg1.name="Bhranthesha Park";
		ref2.place="Shikaripura";
		ref3.gettingFreshAir=true;
		ref4.numberOfTrees=625;
		ref5.iswalkAvailable=true;
		ref6.isExerciseAvailable=true;
		ref7.isgamesAvailable=true;
		ref8.avgNumberOfvistors=80;
		ref9.gateOpenTime="7:00 AM";
		ref10.gateClosinTime="8:00 PM";
			System.out.println("Name of park  "+reg1.name);
			System.out.println("place :"+ref2.place);
			System.out.println("fresh air avialable:"+ref3.gettingFreshAir);
			System.out.println("Number Of Trees: "+ref4.numberOfTrees);
			System.out.println("Walk availbale or not:"+ref5.iswalkAvailable);
			System.out.println("Exercise Avilable or not: "+ref6.isExerciseAvailable);
			System.out.println("games Avilable or not:"+ref7.isgamesAvailable);
			System.out.println("Average Number Of vistors: "+ref8.avgNumberOfvistors);
			System.out.println("gate Open Time:"+ref9.gateOpenTime);
			System.out.println("gate closing Time:"+ref10.gateClosinTime);
			
	
	
	}


}