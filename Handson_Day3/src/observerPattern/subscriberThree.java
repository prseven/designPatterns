package observerPattern;

public class subscriberThree implements observer {

	publisher publisher;
	
	public subscriberThree(publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber three :: " + publisher.getState());
	}

}
