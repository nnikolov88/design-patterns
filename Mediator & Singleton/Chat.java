package mediatorsingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private ChatBot chatBot;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {		
		this.users.add(user);		
	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.contains("addBot")) {			
			this.chatBot = ChatBot.getInstance();
			System.out.println("The ChatBot has entered the room.");			
		}
		
		if(chatBot != null) {
			this.users.remove(user);	
			
			if(chatBot.messageSetings(message)){
				
				for(User chatUser : this.users) {		
					if(user != chatUser) {
						chatUser.receive(message);
						
					}
				}	
			}
		}			
	}

	@Override
	public void removeUser(User user) {	
		this.users.remove(user);	
	}

}
