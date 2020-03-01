import application.DatabaseUtil;
import application.Restriction;
import application.Statistics;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RequirementTest {
    //Iteration 1 Start

    //test access to database
    @Test
    public void Database_Access(){
        DatabaseUtil util = new DatabaseUtil("some/url");

        assertNotNull(util.connect());
    }
    //display info
    @Test
    public void Informaion_Display() {
        DatabaseUtil util = new DatabaseUtil("some/url");
        String expected = "Kennesaw, GA";

        assertEquals(expected, util.getInfo());
    }
    //display location history
    @Test
    public void Location_History (){
        DatabaseUtil util =  new DatabaseUtil("some/url");
        String expected = "Kennesaw, GA";

        assertEquals(expected, util.getLocationHistory());
    }
    // convert queries into text files
    @Test
    public void TextFile(){
        DatabaseUtil util = new DatabaseUtil("some/url");
        File expected = new File ("some file path");

        assertEquals(expected, util.convertResultsToFile());
    }
    // display info with specific restrictions
    @Test
    public void InformationRestriction_Display(){
        DatabaseUtil util = new DatabaseUtil("some/url");
        Restriction expected = new Restriction(new Date(), "locations", "traffic", "patterns", "conditions");

        assertEquals(expected, util.InfoRestrictions());
    }

    //Iteration 2 start

    //test accurate traffic patterns and conditions
    //i dont know
    @Test
    public void accurateTraffic(){

    }

    //test the comparison between two different locations
    @Test
    public void compareLocations(){

        Location object1 = new Location("traffic pattern","condition","condition overtime");
        Location object2 = new Location("traffic pattern","condition","condition overtime");

        assertEquals(1, object1.compareTo(object2));
    }

    //test statistics
    @Test
    public void Statistics(){
        Statistics statistics = new Statistics(new ArrayList<>());

        double expectedMean = 0;
        double expectedMedian = 0;
        double expectedMode = 0;
        double expecedRange = 0;


        assertEquals(expectedMean, statistics.mean());
        assertEquals(expectedMedian, statistics.median());
        assertEquals(expectedMode, statistics.mode());
        assertEquals(expecedRange, statistics.range());
    }

    //test locations information from past and present
    @Test
    public void timeFrames(){

    }

    // test travel distance between two locations
    @Test
    public void travelDistance(){
        Location object1 = new Location("trafficPatterns", "condtitions","overtime");
        Location object2 = new Location("trafficPatterns", "condtitions","overtime");

        double expected = 0;

        assertEquals(expected, object1.getDistance(object2));
    }

    // start iteration 3

    //test any travel delays because of traffi and conditions
    @Test
    public void travelDistance_Condtions(){
        Location object1 = new Location("trafficPatterns", "condtitions","overtime");
        Location object2 = new Location("trafficPatterns", "condtitions","overtime");

        double expected = 0;

        assertEquals(expected, object1.travelLag(object2));
    }



}