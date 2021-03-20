package observerPattern;

public class subscriberTwo implements observer {

	publisher publisher;
	
	public subscriberTwo(publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber two :: " + publisher.getState());
	}

}
