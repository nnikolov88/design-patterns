package mediatorsingleton;

public class MediatorMain {

	public static void main(String[] args) {


		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Nikolay");
		User user2 = new ChatUser(chat, "Andrey");
		User user3 = new ChatUser(chat, "Teodora");
		
		
		user2.send("Hey,what sport you want to watch today ?");
		user3.send("Tenis");
		user1.send("Football");
		user3.send("Baskettball");
	}

}
