package model;

import java.util.List;

public class CustomerSummaries {
    private Integer customerId;
    private Integer totalCostInCents;
    private List<Trip> trips;

    public CustomerSummaries() {
    }

    public CustomerSummaries(Integer customerId, Integer totalCostInCents, List<Trip> trips) {
        this.customerId = customerId;
        this.totalCostInCents = totalCostInCents;
        this.trips = trips;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getTotalCostInCents() {
        return totalCostInCents;
    }

    public void setTotalCostInCents(Integer totalCostInCents) {
        this.totalCostInCents = totalCostInCents;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "CustomerSummaries{" +
                "customerId=" + customerId +
                ", totalCostInCents=" + totalCostInCents +
                ", trips=" + trips +
                '}';
    }
}
