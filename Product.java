package SimpleShoppingApplication;

public class Product {
	 private int id;
	 private String name;
	 private double price;
	 private int quantity;
	
	public Product(int id, String name, double price, int quantity)
	{
	    super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	      }
	
		public int getId()
		{
		return id;
	     }

        public String getName() 
         {
		return name;
	     }

        public double getPrice() 
        {
		return price;
	    }

        public int getQuantity()
        {
		return quantity;
	    }

          public void decreaseQuantity(int amount) throws InsufficientQuantityException{
			if(amount>quantity) 
			{
				throw new InsufficientQuantityException("Insufficient quantity:");
			}
			else 
			{
				quantity= quantity-amount;
				System.out.println("Current quantity is :"+quantity);
				
				
			}
		}
	

}
