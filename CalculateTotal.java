package SimpleShoppingApplication;

public class CalculateTotal {
	public double  CalculateTotal() {
		for(cartItem item:cart.values()) {
			total+=item.product.getPrice()*item.quantity;
		}
		return total;
		
		}
	
	
}
