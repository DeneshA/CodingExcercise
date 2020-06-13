import java.util.Scanner;

public class FlightSheduleUS01 {
    private String flightNumber;
    private String depatureAt;
    private String arrivalAt;
    private int SheduleDay;



    public FlightSheduleUS01(String flightNumber, String orderNumber, String depatureAt, String arrivalAt, int sheduleDay, int tripPerDaytoDestinatin) {
        this.flightNumber = flightNumber;
        this.depatureAt = depatureAt;
        this.arrivalAt = arrivalAt;
        SheduleDay = sheduleDay;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepatureAt() {
        return depatureAt;
    }

    public void setDepatureAt(String depatureAt) {
        this.depatureAt = depatureAt;
    }

    public String getArrivalAt() {
        return arrivalAt;
    }

    public void setArrivalAt(String arrivalAt) {
        this.arrivalAt = arrivalAt;
    }

    public int getSheduleDay() {
        return SheduleDay;
    }

    @Override
    public String toString() {
        return "FlightSheduleUS01{" +
                "flightNumber='" + flightNumber + '\'' +
                ", depatureAt='" + depatureAt + '\'' +
                ", arrivalAt='" + arrivalAt + '\'' +
                ", SheduleDay=" + SheduleDay +
                '}';
    }


    public void setSheduleDay(int sheduleDay) {
        SheduleDay = sheduleDay;
    }

    public FlightSheduleUS01(String flightNumber, String depatureAt, String arrivalAt, int sheduleDay) {
        this.flightNumber = flightNumber;
        this.depatureAt = depatureAt;
        this.arrivalAt = arrivalAt;
        SheduleDay = sheduleDay;
    }

}
