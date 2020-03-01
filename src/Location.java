public class Location {
    private String trafficPatterns;
    private String conditions;
    private String conditionsOverTime;

    public Location(String trafficPatterns, String conditions, String conditionsOverTime) {
        this.trafficPatterns = trafficPatterns;
        this.conditions = conditions;
        this.conditionsOverTime = conditionsOverTime;
    }

    public String getTrafficPatterns() {
        return trafficPatterns;
    }

    public void setTrafficPatterns(String trafficPatterns) {
        this.trafficPatterns = trafficPatterns;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getConditionsOverTime() {
        return conditionsOverTime;
    }

    public void setConditionsOverTime(String conditionsOverTime) {
        this.conditionsOverTime = conditionsOverTime;
    }

    public int compareTo(Location other) {
        return 0; // TODO: implement
        // maybe create scale of which location has better or worse conditions/ patterns
    }

    public Double getDistance(Location other){
        return null;
    }

    public Double travelLag(Location other){
        return null;
    }
}
