class LibertyRunner{
     public static void main(String materials[]){
		 
		 boolean isAdded=Liberty.addShoeBrand("ADDIDAS");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Nike");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Puma");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Addidas");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Converse");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("jorden");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Vans");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("reebok");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Gucci");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Prada");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Louis Vuitton");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand(" New Balance");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Skechers");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Dr. Martens");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Steve Madden	");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Timberland");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Clarks");
		 System.out.println("Is material added "+isAdded);
		 Liberty.getAllShoeBrand();
		 boolean isUpdated=Liberty.updateShoeBrand("jorden","Saucony");
		 System.out.println("is material updated "+isUpdated);
		 Liberty.getAllShoeBrand();
		 boolean isDelatedShoes = Liberty.updateShoeBrand("Clarks");
		 System.out.println(isDelatedShoes);
		 Liberty.getAllShoeBrand();
	  }
}
	 



