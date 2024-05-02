package strategy;

import model.Property;

public class SaoPauloTaxStrategy implements TaxCalculationStrategy {
    @Override
    public double calculateTax(Property property) {
        return property.getAreaTotal() * 10 + property.getNumComodos() * 2;
    }
}
