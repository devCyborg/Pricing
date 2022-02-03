package service;

import model.Trip;

public class PricingService {

    private Integer pricesWithLower(String destination) {
        Integer amount = 0;
        switch (destination) {
            case "1-1":
            case "1-2":
            case "2-1":
            case "1-0":
            case "0-1":
                amount = 240;
                break;
            case "2-2":
            case "3-3":
            case "3-4":
            case "4-3":
            case "4-4":
            case "4-0":
            case "0-3":
                amount = 200;
                break;
            case "3-1":
            case "3-2":
            case "1-3":
            case "2-3":
                amount = 280;
                break;
            case "4-2":
            case "4-1":
            case "1-4":
            case "2-4":
                amount = 300;
                break;
        }
        return amount;
    }

    public Integer getCostInCents(Trip trip) {
        String destination = trip.getZoneFrom() + "-" + trip.getZoneTo();
        return pricesWithLower(destination);
    }
}
