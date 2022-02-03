package service;

import model.CustomerSummaries;
import model.Trip;

import java.util.List;

public class CustomerSummariesService {

    public CustomerSummaries getCustomerSummaries(Integer customerId, List<Trip> trips) {
        CustomerSummaries customerSummaries = new CustomerSummaries();
        Integer totalAmount = 0;
        for (Trip trip : trips) {
            totalAmount = totalAmount + trip.getCostInCents();
        }
        customerSummaries.setCustomerId(customerId);
        customerSummaries.setTotalCostInCents(totalAmount);
        customerSummaries.setTrips(trips);
        System.out.println(customerSummaries);
        return customerSummaries;

    }
}
