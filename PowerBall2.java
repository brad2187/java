
public class PowerBall2 extends PowerBall{

	private int powerBall2;
	
	public PowerBall2()
	{
		super();
		setPowerBall2();
	}
	
	public void setPowerBall2()
	{
		int result;
		result = 0 + (int)(Math.random() * (40 - 0 +1));
		powerBall2 = result;
		//System.out.print(powerBall2);
		//System.out.println("\n");
	}
	
	public void printPowerBall2()
	{
		System.out.print("Power ball 2 is ");
		System.out.print(powerBall2);
		System.out.println("\n");
	}
}
