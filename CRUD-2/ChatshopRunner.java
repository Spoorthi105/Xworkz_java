class ChatshopRunner{
	public static void main(String[] name){
		System.out.println("main method started");
		boolean isChatAdded = Chatshop.createChatName("Bhelpuri");
		System.out.println("is chat created: " +isChatAdded);
		boolean ischatPriceAdded = Chatshop.addChatPrice(35.00);
		System.out.println("and the chat price is :"+ischatPriceAdded);
		Chatshop.getChatPrice();
		Chatshop.createChatName("Masala Puri");
		Chatshop.createChatName("dahi puri");
		Chatshop.createChatName("sev puri");
		Chatshop.createChatName("pani puri");
		Chatshop.createChatName("gol gappa");
		Chatshop.getChats();
		
		 boolean isUpdateChatsDone = Chatshop.updateChat("dahi puri", "SAmosa Puri");
		 System.out.println("after updating..."+isUpdateChatsDone);
		System.out.println("main method ended");
		Chatshop.getChats();
		
		boolean isChatsDeleted = Chatshop.deleteChatname("masala Doosa");
		System.out.println(isChatsDeleted);
		Chatshop.getChats();
		
}
}

