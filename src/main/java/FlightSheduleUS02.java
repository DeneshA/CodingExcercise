public class FlightSheduleUS02 {
    private String flightNumber;
    private String orderNumber;
    private String depatureAt;
    private String arrivalAt;
    private int SheduleDay;
    private int tripPerDaytoDestinatin;

    public int getTripPerDaytoDestinatin() {
        return tripPerDaytoDestinatin;
    }

    public void setTripPerDaytoDestinatin(int tripPerDaytoDestinatin) {
        this.tripPerDaytoDestinatin = tripPerDaytoDestinatin;
    }

    public FlightSheduleUS02(String flightNumber, String orderNumber, String depatureAt, String arrivalAt, int sheduleDay, int tripPerDaytoDestinatin) {
        this.flightNumber = flightNumber;
        this.orderNumber = orderNumber;
        this.depatureAt = depatureAt;
        this.arrivalAt = arrivalAt;
        SheduleDay = sheduleDay;
        this.tripPerDaytoDestinatin = tripPerDaytoDestinatin;
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
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    @Override
    public String toString() {
        return "FlightSheduleUS02{" +
                "order :'" + orderNumber + '\'' +
                ",flightNumber :'" + flightNumber + '\'' +
                ", depature :'" + depatureAt + '\'' +
                ", arrival :'" + arrivalAt + '\'' +
                ", Day :" + SheduleDay +
                '}';
    }

    public void setSheduleDay(int sheduleDay) {
        SheduleDay = sheduleDay;
    }


    public FlightSheduleUS02(String flightNumber, String orderNumber, String depatureAt, String arrivalAt, int sheduleDay) {
        this.flightNumber = flightNumber;
        this.orderNumber = orderNumber;
        this.depatureAt = depatureAt;
        this.arrivalAt = arrivalAt;
        SheduleDay = sheduleDay;
    }
}
