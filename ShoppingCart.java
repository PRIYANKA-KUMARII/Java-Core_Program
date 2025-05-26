package SimpleShoppingApplication;

public class ShoppingCart {
	private Product[] carItems;
	private int itemCount;
	
	public ShoppingCart Class(int capacity) {
		carItems= new Product[capacity];
		itemCount=0;
	}
		
		public void addToCart (Product p, int qty) throws InsufficientQuantityException{
		{
			if(p==null) {
				throw new InvalidProductException("Product is not found in the inventory.");
				
			}
			if(itemCount >=carItems.length) {
				throw new InvalidProductException("Cart is full. Cannot add more products.");
				Product.decreaseQuantity(Quantity);
			Product cartProduct= new Product(
					p.getId(),
					p.getName(),
				p.getPrice(),
					qty
					);
			}
		}
		
		}
		public double calculateTotal() {
			double total= 0;
			for(int i=0; i<=itemCount; i++);
			
			total+=carItems[i].getPrice()* carItems[i].getQuantity();
		}
						}
				
			
			
	