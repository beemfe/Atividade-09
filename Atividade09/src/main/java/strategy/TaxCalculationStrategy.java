package strategy;

import model.Property;

public interface TaxCalculationStrategy {
    double calculateTax(Property property);
}
