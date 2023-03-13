package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking {
private String flightCompany = "Flights-of-Fancy";
private String flightID = "Java263415";
private String passengerFullName;
private double departingTicketPrice;
private double returnTicketPrice;
private double totalTicketPrice;
private String ticketNumber;
private LocalDate departureDate;
private LocalDate returnDate;
private int childPassengers;
private int adultPassengers;
private int totalPassengers;
private BookingClass Bookingclass;
private TripSource Tripsource;
private SourceAirport sourair;
private DestinationAirport desair;
private TripType Triptype;
private TripDestination Tripdestination;



public static String usingMath(int length) {
    String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "0123456789";
    String allCharacters = alphabetsInUpperCase + numbers;
    StringBuilder a = new StringBuilder();
    for (int i = 0; i < length; i++) {
        int randomIndex = (int) (Math.random() * allCharacters.length());
        a.append(allCharacters.charAt(randomIndex));
    }
    return a.toString();
}

    public enum BookingClass {
        FIRST, BUSINESS, ECONOMY;
    }

    public enum  TripType{
        ONE_WAY, RETURN;
    }

    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    public enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;;
    }

    public enum SourceAirport {
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;
    }

    public enum DestinationAirport {
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;
    }

    public FlightBooking(String passengerFullName, LocalDate depart, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = passengerFullName;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
         
    }

    public String getFlightCompany() {
        return flightCompany;
    }

    public String getFlightID()  {
        return flightID;
    }
    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }
    public String getPassengerFullName() {
        return passengerFullName;
    }
    
    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }
    public int getChildrenPassengers() {
        return childPassengers;
    }
    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }
    public int getAdultPassengers() {
        return adultPassengers;
    }


    public void setTotalPassengers(int adultPassengers,int childPassengers){
        this.totalPassengers = adultPassengers + childPassengers;
        }
    public int getTotalPassengers() {
        return totalPassengers;
    }

   
   public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getDepartingDate() {
        return departureDate;
    }
    public void setReturnDate(LocalDate returnDate) {
         long between = returnDate.toEpochDay()-departureDate.toEpochDay();
         if(between >= 2){
         this.returnDate = returnDate;
         }else{
         this.returnDate = departureDate.plusDays(2);
         }
        }
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBookingClass(String num1) {;
        switch(num1) {
            case "1":
            Bookingclass = BookingClass.FIRST;
            break;
            case "2":
            Bookingclass = BookingClass.BUSINESS;
            break;
            case "3":
            Bookingclass = BookingClass.ECONOMY;
            break;
            default :
            System.out.println("No class chosen.");
        }
    }
    public BookingClass getBookingclass() {
        return Bookingclass;
    }


    public void setTripType(String num2) {    
        switch(num2) {
            case "1":
            Triptype = TripType.ONE_WAY;
            break;
            case "2":
            Triptype = TripType.RETURN;
            break;
            default :
            System.out.println("No triptype chosen.");
        }
    }
    public TripType getTriptype() {
        return Triptype;
    }


    public void setTripSource(String num) {
        switch(num) {
            case "1":
            Tripsource = TripSource.NANJING;
            break;
            case "2":
            Tripsource = TripSource.BEIJING;
            break;
            case "3":
            Tripsource = TripSource.OULU;
            break;
            case "4":
            Tripsource = TripSource.HELSINKI;
            break;
            case "5":
            Tripsource = TripSource.SHANGHAI;
            break;
            case "6":
            Tripsource = TripSource.PARIS;
            break;
            default :
            System.out.println("No tripsource chosen.");
        }
    }
    public TripSource getTripSource() {
        return Tripsource;
    }

    public void setSourceAirport(TripSource result) {
         if(result.equals(TripSource.NANJING)){
         this.sourair = SourceAirport.Nanjing_Lukou_International_Airport;}
         else if(result.equals(TripSource.BEIJING)){
         this.sourair = SourceAirport.Beijing_Capital_International_Airport;}
         else if(result.equals(TripSource.OULU)){
        this.sourair = SourceAirport.Oulu_Airport;}
         else if(result.equals(TripSource.HELSINKI)){
         this.sourair = SourceAirport.Helsinki_Airport;}
         else if(result.equals(TripSource.SHANGHAI)){
         this.sourair = SourceAirport.Shanghai_Pudong_International_Airport;}
         else if(result.equals(TripSource.PARIS)){
         this.sourair = SourceAirport.Paris_Charles_de_Gaulle_Airport;}
         }
    public SourceAirport getSourceAirport() {
        return sourair;
    }


    public void setTripDestination(String num, String num3) {
        if(!num.equals(num3)) {
            switch(num3) {
            case "1":
            Tripdestination = TripDestination.NANJING;
            break;
            case "2":
            Tripdestination = TripDestination.BEIJING;
            break;
            case "3":
            Tripdestination = TripDestination.OULU;
            break;
            case "4":
            Tripdestination = TripDestination.HELSINKI;
            break;
            case "5":
            Tripdestination = TripDestination.SHANGHAI;
            break;
            case "6":
            Tripdestination = TripDestination. PARIS;
            break;
            default :
            System.out.println("No tripdestination choesn.");
            }
        } else {
            System.out.println("The trip source and the trip destination should not be the same!");
        }
    }
    public TripDestination getTripDestination() {
        return Tripdestination;
    }


    public void setDestinationAirport(TripDestination result2) {
         if(result2.equals(TripDestination.NANJING)){
         this.desair = DestinationAirport.Nanjing_Lukou_International_Airport;}
         else if(result2.equals(TripDestination.BEIJING)){
         this.desair = DestinationAirport.Beijing_Capital_International_Airport;}
         else if(result2.equals(TripDestination.OULU)){
         this.desair = DestinationAirport.Oulu_Airport;}
         else if(result2.equals(TripDestination.HELSINKI)){
         this.desair = DestinationAirport.Helsinki_Airport;}
         else if(result2.equals(TripDestination.SHANGHAI)){
         this.desair = DestinationAirport.Shanghai_Pudong_International_Airport;}
         else if(result2.equals(TripDestination.PARIS)){
         this.desair = DestinationAirport.Paris_Charles_de_Gaulle_Airport;}
    }
    public DestinationAirport getDestinationAirport() {
        return desair;
    }

    
    public String getTicketNumber() {
        String Ticketnumber;
        String a = usingMath(4);
        if(Triptype == (TripType.ONE_WAY)) {
            Ticketnumber = "11";
            if(Bookingclass == (BookingClass.FIRST)){
                Ticketnumber = Ticketnumber + "F" + a;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.BUSINESS) {
                Ticketnumber = Ticketnumber + "B" + a;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.ECONOMY) {
                Ticketnumber = Ticketnumber + "E" + a;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            }
        } else {
            Ticketnumber = "22";
            if(Bookingclass == BookingClass.FIRST){
                Ticketnumber = Ticketnumber + "F" + a;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.BUSINESS) {
                Ticketnumber = Ticketnumber + "B" + a;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.ECONOMY) {
                Ticketnumber = Ticketnumber + "E" + a;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            }
        }

        return Ticketnumber;
    }

    


    public void setDepartingTicketPrice(int childPassengers, int adultPassengers) {
        double departingTicketPrice = 0.0;
        if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
            departingTicketPrice = 345;
        }else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)){
            departingTicketPrice = 345;
        }
        else {
            departingTicketPrice = 375;
        }
        if(Bookingclass == BookingClass.FIRST) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers  + 250;
        } else if(Bookingclass == BookingClass.BUSINESS) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 150;
        } else if(Bookingclass == BookingClass.ECONOMY) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 50;
        }
    }

    public void setReturnTicketPrice() {
        if(Triptype == TripType.ONE_WAY) {
            this.returnTicketPrice = 0;
        } else {
            this.returnTicketPrice = this.departingTicketPrice;
        }
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = this.departingTicketPrice + this.returnTicketPrice;
    }

    public double getTotalTicketPrice() {
        return this.totalTicketPrice;
    }

    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +  flightCompany + 
        ". Following are the details of your booking and the trip:" + "\n" +  
        "Ticket Number: " + ticketNumber + "\n" +  
        "From " + Tripsource + " to " + Tripdestination + "\n" + 
        "Date of departure: " + departureDate + "\n" + 
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" + 
        "Total ticket price in Euros: " + totalTicketPrice;}
}
}
