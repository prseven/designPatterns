package observerPattern;

public class subscriberOne implements observer {

	publisher publisher;
	
	public subscriberOne(publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber one :: " + publisher.getState());
	}

}

