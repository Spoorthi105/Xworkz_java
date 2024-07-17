class RedChilliesEntertainmentRunner{
	public static void main(String[] emtertaining){
	System.out.println("main method started");
	boolean isAddedNew =   RedChilliesEntertainment.addMovieActors("Ram Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Rajendra Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Ravi Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Raj Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Rashmi Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Roja Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Radhika Reddy");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Rakshita Reddy");
	System.out.println("movie added "+isAddedNew);
    isAddedNew =   RedChilliesEntertainment.addMovieActors("Ragini Reddy");
	System.out.println("movie added "+isAddedNew);
	RedChilliesEntertainment.getMovieActors();
	
	
	boolean isUpdateYourMovie = RedChilliesEntertainment.movieUpdateMethod("Ragini Reddy","Allu Arjun");
	System.out.println("REd chilli EnterTainment Updated As :" +isUpdateYourMovie);
	RedChilliesEntertainment.getMovieActors();
	System.out.println("main method ended");
	
	boolean isActorDeletedHere = RedChilliesEntertainment.deleteActorname("Raj Reddy");
	System.out.println(isActorDeletedHere);
	RedChilliesEntertainment.getMovieActors();
	
	
	
	}
}





