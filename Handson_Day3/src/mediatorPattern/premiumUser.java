package mediatorPattern;

public class premiumUser implements iUser {
	
	private iChatMediator chatmediator;
	private String name;
	
	public premiumUser(iChatMediator chatmediator, String name) {
		this.chatmediator = chatmediator;
		this.name = name;
	}
	
	@Override
	public void sendMessage(String message) {
		chatmediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(name + ": {Premium User} has received a message: " + message);
	}

}