package Multithreading.com;
public class OLA_cab_booking {
	public static void main(String[] args) throws InterruptedException {
//        System.out.println(" Welcome to OLA Riding App\n");
		RideRequest rideRequest = new RideRequest();
        FareCalculation fareCalculation = new FareCalculation();
        rideRequest.start();
        fareCalculation.start();
        rideRequest.join();

                DriverAssignment driverAssignment = new DriverAssignment();
        driverAssignment.start();
        driverAssignment.join();

        LiveTracking liveTracking = new LiveTracking();
        liveTracking.start();
        liveTracking.join();

        PaymentProcessing paymentProcessing = new PaymentProcessing();
        paymentProcessing.start();
        paymentProcessing.join();

        RatingSystem ratingSystem = new RatingSystem();
        ratingSystem.start();
        ratingSystem.join();
    }
}
