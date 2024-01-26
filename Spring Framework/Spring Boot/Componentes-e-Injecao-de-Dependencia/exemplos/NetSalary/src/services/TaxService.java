package services;

public class TaxService {
    Double tax(Double amount) {
        return amount / (100 / 20);
    }
}
