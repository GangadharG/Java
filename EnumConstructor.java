enum BatteryStatus2 { 
	
	FULL(100), HALF(50), ZERO(0);
	BatteryStatus2(int num){ // constructor
		this.num = num;
	}
	
	private int num;  
	public int getNum(){
		return num;
	}
}

public class EnumConstructor {

	BatteryStatus2 percent;   // Each instance has an enum
	public static void main(String[] args) {

		EnumConstructor laptop1 = new EnumConstructor();
		laptop1.percent = BatteryStatus2.ZERO;
		System.out.println(laptop1.percent.getNum()); // prints 0
		
		EnumConstructor laptop2 = new EnumConstructor();
		laptop2.percent = BatteryStatus2.FULL;
		System.out.println(laptop2.percent.getNum()); // prints 100
		
		for(BatteryStatus2 stat : BatteryStatus2.values())
			System.out.println(stat + " " + stat.getNum()); // prints FULL 100 HALF 50 ZERO 0
	}
}
