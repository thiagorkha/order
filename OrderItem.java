package entities;

import entities.Product;

public class OrderItem {

  private Integer quantity;
  private Double price;

  private Product product;

  public OrderItem() {
  }

  public OrderItem(final Integer quantity, final Double price, final Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public Integer getQuantity() {
  	return quantity;
  }
  
  public void setQuantity(final Integer quantity) {
  	this.quantity = quantity;
  }
  
  public Double getPrice() {
  	return price;
  }
  
  public void setPrice(final Double price) {
  	this.price = price;
  }
  
  public Product getProduct() {
  	return product;
  }
  
  public void setProduct(final Product product) {
  	this.product = product;
  }
  
  public Double subTotal() {
    return quantity * price;
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