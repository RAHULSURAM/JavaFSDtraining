package com.OrderManagement;

public class ProductClient {

	public static void main(String args[]) {
		ProductManagmentImpl productMgmt = new ProductManagmentImpl();
		Product product = new Product();
		product.setPrice(20000);
		product.setProductName("Laptop");
		product.setQuantity(5);
		productMgmt.createProduct(product);
	}
}
