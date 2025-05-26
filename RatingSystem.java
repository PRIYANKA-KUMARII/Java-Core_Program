package Multithreading.com;

public class RatingSystem extends Thread {
	
	public void run() {
		System.out.println("Requesting user rating...");
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("User rated the ride: 5 star");


	}

}
