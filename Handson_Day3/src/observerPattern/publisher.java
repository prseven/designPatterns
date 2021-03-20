package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class publisher implements Subject{

	String state;
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyAllObservers();
	}

	private List<observer> observers = new ArrayList<>();
	@Override
	public void attach(observer ob) {
		observers.add(ob);
	}

	@Override
	public void detach(observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyAllObservers() {
		for(observer obs: observers) {
			obs.update();
		}
	}

}
