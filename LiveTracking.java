package Multithreading.com;

public class LiveTracking  extends Thread{
	@Override
	    public void run() {
	        int[] progress = {20, 40, 60, 80, 100};
	        for (int p : progress) {
	            System.out.println("Updating ride location... " + p + "% completed");
	            try {
	                Thread.sleep(500); // simulate update delay
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("Ride completed!");
	    }
}