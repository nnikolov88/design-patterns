package mediatorsingleton;

public class ChatBot {
	
private static ChatBot instance;
	
	public ChatBot() {
		
	}
	
	
	public static ChatBot getInstance() {
		
		if(instance == null) {
			instance = new ChatBot();
		}		
		
		return instance;
		
	}
	
	public boolean messageSetings(String message) {
		
		if(message.contains("Football")) {
			
			System.out.println("The word: '" + message + "', is not accepted.");
			System.out.println("User removed.");
			return false;
			
		}
		
		return true;
	}
	
}