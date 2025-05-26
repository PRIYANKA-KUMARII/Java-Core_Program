package Multithreading.com;

public class DriverAssignment  extends Thread{
	public void run () {
		try {			System.out.println("DriverAssignment interrupted.");
		
		System.out.println("Drivers found bearby drivers...");

		Thread.sleep(3000);
	}catch(InterruptedException e) {

		}
	}


