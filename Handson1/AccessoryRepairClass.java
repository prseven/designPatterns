package Handson1;

public class AccessoryRepairClass implements ProcessAccessoryRepairInterface{
	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " accessory repair accepted!!!");
	}
}
