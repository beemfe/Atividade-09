package strategy;

import model.Property;

public class CuritibaTaxStrategy implements TaxCalculationStrategy {
    @Override
    public double calculateTax(Property property) {
        return property.getAreaTotal() * 10 + property.getNumComodos() * 2;
    }
}
