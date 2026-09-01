package chapter2;

public class Product {

	private String product_id;
	private String product_name;
	private double price;
	private int qty;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Product(String product_id, String product_name, double price, int qty) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.qty = qty;
	}
	
	
}
