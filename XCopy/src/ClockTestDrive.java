
public class ClockTestDrive {

	public static void main(String[] args) {
		Clock c = new Clock();
		
		c.seTime("12345");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}

}
