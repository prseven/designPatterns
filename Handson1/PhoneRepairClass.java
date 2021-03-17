package Handson1;

public class PhoneRepairClass implements ProcessPhoneRepairInterface {
	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!!");
	}

}
