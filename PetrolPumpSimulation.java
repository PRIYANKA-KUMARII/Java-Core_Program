package java_30April;

import java.util.Scanner;

public class PetrolPumpSimulation{ 
	public static void main(String [] args) {
		PetrolPump pump= new PetrolPump();
		Car car[] = new Car[3];
		Scanner sc = new Scanner(System.in);
		for(int i= 0; i<car.length; i++) 
		{
			System.out.println("enter carname:");
			String name = sc.nextLine();
			
			car[i] = new Car(name, pump);            
        }
		
		Thread threads[] = new Thread[3];
		for (int i=0;i<car.length;i++) 
		{
			threads[i] = new Thread(car[i]);
			
		}
		for(Thread t: threads) 
		{
			try {
				t.start();
				t.join();
			}catch(InterruptedException e) {
				System.out.println("A thread was interrupted during join.");
				}
		}
		System.out.println("All cars have completed refilling.");
		
	}
}

class PetrolPump {
	public synchronized void refillCar(String name) {
		System.out.println(name+" :started refilling..");
		try {
			Thread .sleep(3000);
		}catch(InterruptedException e) {
			System.out.println(name +" was  interrupted during reffiling.");
		}
		System.out.println(name +" completed reffilling!");
	}
}
    class Car implements Runnable {
    	private String carName;
    	private PetrolPump pump;
    	public Car(String carName, PetrolPump pump) {
    		this.carName= carName;
    		this.pump= pump;
    	}
    	@Override
    	public  void run() {
    		pump.refillCar(carName);
    	}
    }


