package mediatorPattern;

import java.util.*;
public class chatMediator implements iChatMediator {
	
	List<iUser> users;
	
	public chatMediator(){
		users = new ArrayList<>();
	}
	
	@Override
	public void addUser(iUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, iUser sender) {
		for(iUser itr: users) {
			if(itr != sender) {
				itr.receiveMessage(message);
			}
		}
	}

}