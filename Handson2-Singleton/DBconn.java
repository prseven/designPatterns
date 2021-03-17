package Singleton;

public class DBconn {
	private static DBconn obj = new DBconn();
	
	private DBconn() {}
	
	public static DBconn getInstance() {
		return obj;
	}
}