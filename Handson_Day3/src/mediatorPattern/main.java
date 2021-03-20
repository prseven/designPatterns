package mediatorPattern;

public class main {

	public static main(String[] args) {
		chatMediator cm = new chatMediator();
		
		iUser basicUser = new basicUser(cm, "Alice");
		iUser premiumUser = new premiumUser(cm, "Bob");
		
		cm.addUser(basicUser);
		cm.addUser(premiumUser);
		cm.addUser((iUser) new basicUser(cm, "clark"));
		cm.addUser(new premiumUser(cm, "Danny"));
		
		premiumUser.sendMessage("Hi there!!");
	}

}