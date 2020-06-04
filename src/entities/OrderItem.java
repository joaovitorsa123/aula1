package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	OrderItem(){
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return price*quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	@Override

	public String toString() {

		return product.getName() 

				+ ", $" 

				+ String.format("%.2f", price) 

				+ ", Quantity: " 

				+ quantity + 

				", Subtotal: $" 

				+ String.format("%.2f", subTotal());

	}

}
