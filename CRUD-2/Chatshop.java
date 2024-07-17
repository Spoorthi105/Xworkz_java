import java.util.*;
// java uses all files automatically which are available in lang folder of JDK

class Chatshop{
	static String name="kadala kinara";
	static String ownerName="ss";
	static String chatNames[] = {null,  null, null, null, null, null};
	static double chatPrices[] = {0.0, 0.0, 0.0 , 0.0, 0.0, 0.0 };
	static int  index;
	static int chatPriceIndex;
	//add chatname in chatNames index position(ref)ref
public static boolean createChatName(String chatName){
    boolean isChatCreated = false;

	System.out.println("createChatName started");
	if(chatName != null){
		chatNames[index] = chatName;
		index++;
		isChatCreated = true;
	}
	else
	System.out.println("The chat name entered null is not acceptable..");
	
	System.out.println("createChatName ended");
	return isChatCreated;
}
public static void getChats(){
 System.out.println("chats avilable are");
	for(String chatNa : chatNames)
		System.out.println(chatNa);
}

public  static boolean addChatPrice(double chatPrice){
	System.out.println("getChatPrice started");
	boolean isPriceAdded = false;
	if(chatPrice > 0.0){
		chatPrices[chatPriceIndex] = chatPrice;
		chatPriceIndex++;
		isPriceAdded = true;
	}
	System.out.println("getChatPrice ended");
	return isPriceAdded;
	
}
public static void getChatPrice(){
	for(double price: chatPrices)
		System.out.println(price);
}
public static boolean updateChat(String oldChat, String newChat){
	boolean  isUpdateChats = false;
	System.out.println("updateChat started ");
	for(index = 0; index < chatNames.length; index++){
		if(oldChat == chatNames[index]){
			chatNames[index] = newChat; 
			isUpdateChats = true;
		}
		
	}
	if(isUpdateChats==false){
		System.out.println("enter proper chats name");
	}
	System.out.println("updateChat ended ");
	return isUpdateChats;
}

public static boolean deleteChatname(String chatNameTobeDeleted){
	int newIndex;
	int oldIndex;
	boolean ischatDeleted = false;
	System.out.println("The deleteChatname started");
		for(newIndex=0, oldIndex=0; oldIndex < chatNames.length; oldIndex++){
			if(chatNames[oldIndex] != chatNameTobeDeleted ){
				chatNames[newIndex]= chatNames[oldIndex];
				newIndex++;
				
			}
			else{
				ischatDeleted=true;
			}
			
			
		}
		chatNames = Arrays.copyOf(chatNames, newIndex);
		/*if(chatNames!= null){
			ischatDeleted=true;
			
		}*/
		if(ischatDeleted==false){
			System.out.println(chatNameTobeDeleted  +"not found");
		}
		
		
	
	System.out.println("The deleteChatname ended");
	return ischatDeleted;
}
}