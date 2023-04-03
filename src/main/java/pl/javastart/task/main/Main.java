package pl.javastart.task.main;

import pl.javastart.task.api.CustomerService;
import pl.javastart.task.api.Offer;
import pl.javastart.task.api.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 2000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}