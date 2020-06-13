public class Application {

    public static void UserStory01(){
        //User Story 01

        Flight flight1Day1=new Flight("1",20);
        Flight flight2Day1=new Flight("2",20);
        Flight flight3Day1=new Flight("3",20);
        Flight flight1Day2=new Flight("4",20);
        Flight flight2Day2=new Flight("5",20);
        Flight flight3Day2=new Flight("6",20);

        FlightSheduleUS01 sheduling []=new FlightSheduleUS01[6];
        sheduling[0] = new FlightSheduleUS01(flight1Day1.getFlightCode(),"YUL","YYZ",1);
        sheduling[1] = new FlightSheduleUS01(flight2Day1.getFlightCode(),"YUL","YYC",1);
        sheduling[2] = new FlightSheduleUS01(flight3Day1.getFlightCode(),"YUL","YVR",1);
        sheduling[3] = new FlightSheduleUS01(flight1Day2.getFlightCode(),"YUL","YYZ",2);
        sheduling[4] = new FlightSheduleUS01(flight2Day2.getFlightCode(),"YUL","YYC",2);
        sheduling[5] = new FlightSheduleUS01(flight3Day2.getFlightCode(),"YUL","YVR",2);

        for (int x =0; x<=5; x++){
            System.out.println(sheduling[x].toString());
        }


    }

    public static void UserStory02(){
        //Flight shedule per day according to the round trip
        Flight flight1Day1YYZ=new Flight("1",20,3);// if its round trip traveling time 4 Hours
        Flight flight2Day1YYC=new Flight("2",20,1);// if its round trip traveling time 10 Hours
        Flight flight3Day1YVR=new Flight("3",20,1);// if its round trip traveling time 12 Hours
        Flight flight4Day2YYZ=new Flight("4",20,3);// if its round trip traveling time 4 Hours
        Flight flight5Day2YYC=new Flight("5",20,1);// if its round trip traveling time 10 Hours
        Flight flight6Day2YVR=new Flight("6",20,1);// if its round trip traveling time 12 Hours

        //As per JSON data out of 99 - 34 Orders has to ship YYZ
        //Day 1
        FlightSheduleUS02 sheduling []=new FlightSheduleUS02[98];

            for (int i =0;i<34;i++){ //Day 1 can shedule all 34 orders to be shipped
                    System.out.println(sheduling[i] = new FlightSheduleUS02(flight1Day1YYZ.getFlightCode(), "order-00" + (i+1), "YUL", "YYZ", 1));

                }
            for (int j =33; j<61;j++) {
                //As per JSON data out of 99 - 27 Orders has to ship YYZ
                if (j < 53) {
                    //Day 1 can shedule first 20 orders orders to be shipped
                    System.out.println(sheduling[j] = new FlightSheduleUS02(flight2Day1YYC.getFlightCode(), "order-00" + (j+1), "YUL", "YYC", 1));
                }
                if (j > 53) {
                    //Day 2 can shedule all the reminder orders to be shipped
                    System.out.println(sheduling[j] = new FlightSheduleUS02(flight5Day2YYC.getFlightCode(), "order-00" + (j+1), "YUL", "YYC", 2));
                }
                for (int k = 61; k < 98; k++) {
                    //As per JSON data out of 99 - 38 Orders has to ship YYZ
                    if (k < 81) {
                        //Day 1 can shedule first 20 orders orders to be shipped
                        System.out.println(sheduling[k] = new FlightSheduleUS02(flight3Day1YVR.getFlightCode(), "order-00" + (k+1), "YUL", "YVR", 1));
                    }
                    if (k < 98) {
                        //Day 1 can shedule first 20 orders orders to be shipped
                        System.out.println(sheduling[k] = new FlightSheduleUS02(flight6Day2YVR.getFlightCode(), "order-00" +(k+1), "YUL", "YVR", 2));
                    }
                }

            }
            }



    public static void main(String[] args) {

        Application.UserStory01();
        System.out.println("#####################################");
        Application.UserStory02();

    }
}
