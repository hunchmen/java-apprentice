/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.strategy;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public interface TaxStrategy {

    double computeTax(double amount);
}


class MinnesotaTaxImpl implements TaxStrategy {

    private final double TAX_RATE = 0.0678;

    @Override
    public double computeTax(double amount) {
        return amount * TAX_RATE;
    }

}


class CaliforniaTaxImpl implements TaxStrategy {

    private final double TAX_RATE = 0.0675;

    @Override
    public double computeTax(double amount) {
        return amount * TAX_RATE;
    }

}


class NewYorkTaxImpl implements TaxStrategy {

    private final double TAX_RATE = 0.04;

    @Override
    public double computeTax(double amount) {
        return amount * TAX_RATE;
    }

}


class NewMexicoTaxImpl implements TaxStrategy {

    private final double TAX_RATE = 0.05125;

    @Override
    public double computeTax(double amount) {
        return amount * TAX_RATE;
    }

}


class TexasTaxImpl implements TaxStrategy {

    private final double TAX_RATE = 0.0625;

    @Override
    public double computeTax(double amount) {
        return amount * TAX_RATE;
    }

}


class CalculateTax {

    private TaxStrategy taxStrategy;

    public CalculateTax(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(double amount) {
        return taxStrategy.computeTax(amount);
    }
}


class TaxImplementation {

    public static void main(String[] args) {
        System.out.println("******* Tax implementation for Minnesota State");
        CalculateTax calTax = new CalculateTax(new MinnesotaTaxImpl());
        double minnesotaTax = calTax.calculateTax(100.0);
        System.out.format("Minnesota Tax: %.2f", minnesotaTax);
        System.out.println();

        System.out.println("******* Tax implementation for California State");
        calTax.setStrategy(new CaliforniaTaxImpl());
        double californiaTax = calTax.calculateTax(100.0);
        System.out.format("California Tax: %.2f", californiaTax);
        System.out.println();

        System.out.println("******* Tax implementation for New York State");
        calTax.setStrategy(new NewYorkTaxImpl());
        double newYorkTax = calTax.calculateTax(100.0);
        System.out.format("New York Tax: %.2f", newYorkTax);
        System.out.println();

        System.out.println("******* Tax implementation for New Mexico State");
        calTax.setStrategy(new NewMexicoTaxImpl());
        double newMexicoTax = calTax.calculateTax(100.0);
        System.out.format("New Mexico Tax: %.2f", newMexicoTax);
        System.out.println();

        System.out.println("******* Tax implementation for Texas State");
        calTax.setStrategy(new TexasTaxImpl());
        double texasTax = calTax.calculateTax(100.0);
        System.out.format("Texas Tax: %.2f", texasTax);
        System.out.println();

    }
}
