import java.util.*;

class RedChilliesEntertainment {
	static int index;
static String actors[] = {null, null, null, null, null, null, null, null, null,};
	public static boolean addMovieActors(String actor){
		boolean isMovieActors = false;
		System.out.println("addMovieActors started");
	    if(actor != null){
			actors[index] = actor;
			index++;
			isMovieActors = true;
		}
		System.out.println("addMovieActors ended");
		return isMovieActors;
	}
	
	public static void getMovieActors(){
		System.out.println("getMovieActors started");
		for(String chillActor : actors)
		System.out.println(chillActor);
		System.out.println("getMovieActors started");
	}
	
	public static boolean movieUpdateMethod(String oldMovie, String newMovie){
		boolean isupdateMovie = false;
		System.out.println("movieUpdateMethod started......");
		for(index=0; index< actors.length; index++ ){
		if(actors[index]==oldMovie){
			oldMovie = newMovie;
		}
		}
		if(isupdateMovie== true)
			System.out.println("cant update this movie...");
		
		System.out.println("movieUpdateMethod ended......");
		return isupdateMovie;
	}
	public static boolean deleteActorname(String actorNameTobeDeleted){
	int newIndex;
	int oldIndex;
	boolean isActorDeleted = false;
	System.out.println("The deletedactorname started");
		for(newIndex=0, oldIndex=0; oldIndex < actors.length; oldIndex++){
			if(actors[oldIndex] != actorNameTobeDeleted ){
				actors[newIndex]= actors[oldIndex];
				newIndex++;
				
			}
	
		}
		//copyOf = it returns a array for which you want to return a copy
		 actors = Arrays.copyOf(actors, newIndex);
		if(actors!= null){
			isActorDeleted=true;
			
		}
		if(isActorDeleted==false){
			System.out.println(actorNameTobeDeleted+"not found");
		}
		
	
	System.out.println("The deleteChatname ended");
	return isActorDeleted;
}


}