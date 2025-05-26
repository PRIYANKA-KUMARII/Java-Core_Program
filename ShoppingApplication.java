package SimpleShoppingApplication;

public class ShoppingApplication {	
	public class SimpleShoppingApplication {
		public static void main(String[] args) {
	        Product p1 = new Product(101, "Laptop", 750.00, 5);
	        Product p2 = new Product(102, "Phone", 300.00, 10);
	        Product p3 = new Product(103, "Headphones", 50.00, 15);

	        ShoppingCart cart = new ShoppingCart(10);

	        try {
	           
	            cart.addToCart(p1, 2);
	            cart.addToCart(p2, 3);
	            cart.addToCart(p1, 10);
	        } catch (InsufficientQuantityException | InvalidProductException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        try {
	            // Invalid product (null)
	            cart.addToCart(null, 1);
	        } catch (InsufficientQuantityException | InvalidProductException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	            for (int i = 0; i < 8; i++) {
	                cart.addToCart(p3, 1);
	            }
	        } catch (InsufficientQuantityException | InvalidProductException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        double total = cart.calculateTotal();
	        System.out.println("Total Price: $" + total);
	    }
	}


}
