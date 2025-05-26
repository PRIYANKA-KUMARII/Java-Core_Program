package ExceptionHandling;

public class CarTest {
	public static void stop(String msg) throws CarStoppedException
	{
		if("stop".equalsIgnoreCase(msg))
		{
			throw new CarStoppedException("car stoppes due to soem reson");
		}
		else {
		       System.out.println("car not stall.");
		}
	}
		public static void Puncture(String status) throws CarPunctureException{
		if ("puncture". equalsIgnoreCase(status)) {
			throw new CarPunctureException("Car is punctured!");
		}
		else {
			System.out.println(" Car not puncture.");
		}
		}
		public static void CarHeat(int temperature)throws CarHeatException{
			if(temperature>50) {
				throw new CarHeatException("Car is heated more than 50 degres!");
			}else {
				System.out.println("Car is not stall.");
				
		}
	
		

		}
}
