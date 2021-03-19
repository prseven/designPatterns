package Handson;
interface MovableAdapter{
	    double speed();//returns speed in kmph
	    double price();
	}
	interface Movable{
	    double speed();//returns speed in mph
	    double price();
	}
	class BugatiVeyron implements Movable{

	    @Override
	    public double speed() {
	        return 268.0;
	    }

	    @Override
	    public double price() {
	        return 1.16;
	    }
	}
	class MovableAdapterImpl implements MovableAdapter{
	    private Movable luxuryCars;
	    //constructor
	    public MovableAdapterImpl(Movable obj){
	        this.luxuryCars=obj;
	    }
	    @Override
	    public double speed() {
	        return ConvertMPHtoKMPH(luxuryCars.speed());
	    }

	    @Override
	    public double price() {
	        return ConvertEurotoUSD(luxuryCars.price());
	    }

	    private double ConvertEurotoUSD(double cost){
	        return cost*1.19;
	    }
	    private double ConvertMPHtoKMPH(double mph){
	        return mph*1.60934;
	    }
	}
	public class adapterPattern {
	    public static void main(String[] args) {
	        BugatiVeyron car=new BugatiVeyron();
	        System.out.println("Bugati veyron speed in MPH");
	        System.out.println(car.speed());    
	        System.out.println("Bugati veyron price in million Euros");
	        System.out.println(car.price());    
	        MovableAdapter bugatiVeyronAdapter=new MovableAdapterImpl(car);
	        System.out.println("Bugati veyron speed in KMPH");
	        System.out.println(bugatiVeyronAdapter.speed());    
	        System.out.println("Bugati veyron price in million USD");
	        System.out.println(bugatiVeyronAdapter.price());    
	    }
	}


