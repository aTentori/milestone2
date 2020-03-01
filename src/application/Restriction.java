package application;

import java.util.Date;

public class Restriction {
    private Date dateTime;
    private String locations;
    private String traffic;
    private String patterns;
    private String conditions;

    public Restriction(Date dateTime, String locations, String traffic, String patterns, String conditions) {
        this.dateTime = dateTime;
        this.locations = locations;
        this.traffic = traffic;
        this.patterns = patterns;
        this.conditions = conditions;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getPatterns() {
        return patterns;
    }

    public void setPatterns(String patterns) {
        this.patterns = patterns;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
