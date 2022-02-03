package service;

import model.Tap;
import model.Trip;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class TripService {

    public List<Trip> getTripsForCustomerByTap(List<Tap> customersTaps) {
        List<List<Tap>> partitions = ListUtils.partition(customersTaps, 2);
        PricingService pricingService = new PricingService();

        ArrayList<Trip> trips = new ArrayList<>();
        for (List<Tap> partition : partitions) {
            Trip trip = new Trip();
            Tap start = partition.get(0);
            Tap end = partition.get(1);

            trip.setStationStart(start.getStation());
            trip.setStationEnd(end.getStation());

            trip.setStartedJourneyAt(start.getUnixTimestamp());

            trip.setZoneFrom(getZoneFromStation(start.getStation()));
            trip.setZoneTo(getZoneFromStation(end.getStation()));

            Integer costInCents = pricingService.getCostInCents(trip);
            trip.setCostInCents(costInCents);

            trips.add(trip);
        }

        return trips;
    }


    private String getZoneFromStation(String station) {
        String result = "";
        switch (station) {
            case "A":
            case "B":
                result = "1";
                break;
            case "D":
                result = "2";
                break;
            case "F":
                result = "3";
                break;
            case "G":
            case "H":
            case "I":
                result = "4";
                break;
            case "C":
            case "E":
                result = "0";
                break;
        }
        return result;
    }

}
