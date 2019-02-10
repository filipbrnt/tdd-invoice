package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public interface ExciseProduct {
	static final BigDecimal EXCISE = new BigDecimal("5.56");
	void addExcise();
}
