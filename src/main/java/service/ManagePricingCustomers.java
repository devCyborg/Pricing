package service;

import model.CustomerSummaries;
import model.Tap;
import model.Taps;
import model.Trip;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class ManagePricingCustomers {

    private FileUtils fileUtils = new FileUtils();

    public ManagePricingCustomers() {

    }

    public void manage(String inputFile, String outputFileName) {
        // GET DATA TAP FROM INPUT FILE
        Taps taps = fileUtils.mappingDataFromInputFile(inputFile);

        // GROUP TAPS BY CUSTOMER ID
        Map<Integer, List<Tap>> groupedTapsByCustomer = taps.getTaps()
                .stream()
                .collect(groupingBy(Tap::getCustomerId));

        // SORT BY TIMESTAMP
        sortByUnixTimesTamp(groupedTapsByCustomer);

        // CONSTRUCT A TRIPS AND CUSTOMERS SUMMARIES
        TripService tripService = new TripService();
        CustomerSummariesService customerSummariesService = new CustomerSummariesService();
        List<CustomerSummaries> customerSummaries = new ArrayList<>();
        for (Map.Entry<Integer, List<Tap>> entry : groupedTapsByCustomer.entrySet()) {
            List<Trip> tripsForCustomerByTap = tripService.getTripsForCustomerByTap(groupedTapsByCustomer.get(entry.getKey()));
            customerSummaries.add(customerSummariesService.getCustomerSummaries(entry.getKey(),tripsForCustomerByTap));
        }

        // PRINT RESULT INTO FILE
        fileUtils.printResultIntoFile(customerSummaries, outputFileName);
    }

    private void sortByUnixTimesTamp(Map<Integer, List<Tap>> collect) {
        for (Map.Entry<Integer, List<Tap>> entry : collect.entrySet()) {
            entry.getValue().sort(Comparator.comparing(Tap::getUnixTimestamp));
        }
    }

}
