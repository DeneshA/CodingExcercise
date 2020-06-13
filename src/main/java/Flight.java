public class Flight {
    private String flightCode;
    private int loadCapacity;
    private int roundTripPerDay

;
    //private int orderRemindertoShip;//As per JSOn file

    public int getroundTripPerDay

() {
        return roundTripPerDay

;
    }

    public void setroundTripPerDay

(int roundTripPerDay

) {
        this.roundTripPerDay

 = roundTripPerDay

;
    }


    public Flight(String flightCode, int loadCapacity, int roundTripPerDay

) {
        this.flightCode = flightCode;
        this.loadCapacity = loadCapacity;
        this.roundTripPerDay

 = roundTripPerDay

;
        //this.orderRemindertoShip = orderRemindertoShip;
    }






    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }




    public Flight(String flightCode, int loadCapacity) {
        this.flightCode = flightCode;
        this.loadCapacity = loadCapacity;
    }
}
