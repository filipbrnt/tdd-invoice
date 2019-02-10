package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class BottleOfWine extends OtherProduct implements ExciseProduct {

	public BottleOfWine(String name, BigDecimal price) {
		super(name, price);
	}
	
	@Override
	public void addExcise() {
		price = price.add(EXCISE);
	}

}
