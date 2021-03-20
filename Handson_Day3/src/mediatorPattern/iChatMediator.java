package mediatorPattern;



public interface iChatMediator {
	void addUser(iUser user);
	void sendMessage(String message, iUser sender);
}