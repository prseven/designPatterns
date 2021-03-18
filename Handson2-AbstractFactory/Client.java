package Handson2-AbstractFactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name");
		String name=sc.nextLine();
		Factory f= FactoryGetter.getFactory(name);
		if(f!=null) {
			f.makeTire();
			f.makeHeadLight();
		}
		else {
			System.out.println("Wrong choice");
		}
	}

}
