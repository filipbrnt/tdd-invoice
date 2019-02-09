package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products;
		
	public Invoice() {
		products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addProduct(Product product, Integer quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < quantity; i++) {
			addProduct(product);
		}
	}

	public BigDecimal getSubtotal() {
		BigDecimal subtotal = new BigDecimal("0");
		if (!products.isEmpty())
			for (Product product : products) {
				subtotal = subtotal.add(product.getPrice());
			}			
		return subtotal;
	}

	public BigDecimal getTax() {
		BigDecimal tax = BigDecimal.ZERO;
		if (!products.isEmpty())
			for (Product product : products) {
				tax = tax.add(product.getPrice().multiply(product.getTaxPercent()));
			}
		return tax;
	}

	public BigDecimal getTotal() {
		if (products.isEmpty()) {
			return BigDecimal.ZERO;			
		}
		return this.getSubtotal().add(this.getTax());
	}
}
