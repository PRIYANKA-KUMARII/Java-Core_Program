package ExceptionHandling;

public class CarUser {
	public static void main(String[] args) 
	{
		try {
		CarTest.stop("stop");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try {
			CarTest.stop("Running");
		}
		catch (CarStoppedException e) {
			System.out.println(e.getMessage());		
		}
		try {
			CarTest.Puncture("Puncture");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try {
			CarTest.CarHeat(60);
		} 
		catch (CarHeatException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			CarTest.CarHeat(40);
		}catch(CarHeatException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
