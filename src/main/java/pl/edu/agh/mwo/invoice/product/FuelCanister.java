package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

import pl.edu.agh.mwo.utils.DateUtils;

public class FuelCanister extends OtherProduct implements ExciseProduct {

	public FuelCanister(String name, BigDecimal price) {
		super(name, price);
	}
	
	@Override
	public void addExcise() {
		if (!DateUtils.isMintersDay())
			price = price.add(EXCISE);
	}

}
