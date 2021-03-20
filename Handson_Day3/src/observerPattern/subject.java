package observerPattern;

public interface subject {
	public void attach(observer ob);
	public void detach(observer ob);
	public abstract void notifyAllObservers();
}
