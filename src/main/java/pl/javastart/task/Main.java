package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 2000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}