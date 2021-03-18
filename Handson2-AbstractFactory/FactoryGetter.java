package Handson2-AbstractFactory;

public class FactoryGetter {
	public static Factory getFactory(String brand) {
		if(brand.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		else if(brand.equalsIgnoreCase("Audi")) {
			return new AudiFactory();
		}
		return null;
	}
}
