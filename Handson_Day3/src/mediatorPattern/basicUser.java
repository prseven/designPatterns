package mediatorPattern;

public class basicUser implements IUser {
		
		private iChatMediator chatmediator;
		private String name;
		
		public basicUser(iChatMediator chatmediator, String name) {
			this.chatmediator = chatmediator;
			this.name = name;
		}
		
		@Override
		public void sendMessage(String message) {
			chatmediator.sendMessage(message, this);
		}

		@Override
		public void receiveMessage(String message) {
			System.out.println(name + ": {Basic User} has received a message: " + message);
		}

	}


