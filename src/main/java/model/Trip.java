package model;

public class Trip {

    private String stationStart;
    private String stationEnd;
    private Integer startedJourneyAt;
    private Integer costInCents;
    private String zoneFrom;
    private String zoneTo;

    @Override
    public String toString() {
        return "Trip{" +
                "stationStart='" + stationStart + '\'' +
                ", stationEnd='" + stationEnd + '\'' +
                ", startedJourneyAt=" + startedJourneyAt +
                ", costInCents=" + costInCents +
                ", zoneFrom='" + zoneFrom + '\'' +
                ", zoneTo='" + zoneTo + '\'' +
                '}';
    }

    public String getStationStart() {
        return stationStart;
    }

    public void setStationStart(String stationStart) {
        this.stationStart = stationStart;
    }

    public String getStationEnd() {
        return stationEnd;
    }

    public void setStationEnd(String stationEnd) {
        this.stationEnd = stationEnd;
    }

    public Integer getStartedJourneyAt() {
        return startedJourneyAt;
    }

    public void setStartedJourneyAt(Integer startedJourneyAt) {
        this.startedJourneyAt = startedJourneyAt;
    }

    public Integer getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(Integer costInCents) {
        this.costInCents = costInCents;
    }

    public String getZoneFrom() {
        return zoneFrom;
    }

    public void setZoneFrom(String zoneFrom) {
        this.zoneFrom = zoneFrom;
    }

    public String getZoneTo() {
        return zoneTo;
    }

    public void setZoneTo(String zoneTo) {
        this.zoneTo = zoneTo;
    }

    public Trip() {
    }

    public Trip(String stationStart, String stationEnd, Integer startedJourneyAt, Integer costInCents, String zoneFrom, String zoneTo) {
        this.stationStart = stationStart;
        this.stationEnd = stationEnd;
        this.startedJourneyAt = startedJourneyAt;
        this.costInCents = costInCents;
        this.zoneFrom = zoneFrom;
        this.zoneTo = zoneTo;
    }
}
