package de.tum.in.www1.model;

/**
 * Created by krusche on 6/20/17.
 */

public class Reservation {

    private String bike;
    private String startDate;
    private String startTime;

    public String getBike() {
        return bike;
    }
    public void setBike(String bike) {
        this.bike = bike;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String time) {
        this.startTime = time;
    }

    public void save() {
        //This method is supposed to store the reservation on the server
    }
}
