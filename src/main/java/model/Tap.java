package model;

public class Tap {
    private Integer unixTimestamp;
    private Integer customerId;
    private String station;

    public Integer getUnixTimestamp() {
        return unixTimestamp;
    }

    public void setUnixTimestamp(Integer unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Tap(Integer unixTimestamp, Integer customerId, String station) {
        this.unixTimestamp = unixTimestamp;
        this.customerId = customerId;
        this.station = station;
    }

    public Tap() {
    }

    @Override
    public String toString() {
        return "Tap{" +
                "unixTimestamp=" + unixTimestamp +
                ", customerId=" + customerId +
                ", station='" + station + '\'' +
                '}';
    }
}
