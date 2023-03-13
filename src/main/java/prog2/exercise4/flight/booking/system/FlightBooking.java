package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class FlightBooking {
    final String flightCompany = "Flights-of-Fancy";
    public String flightID;
    public enum TripSource{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS}
    public enum SourceAirport {
        NanjingLukouInternationalAirport,
        BeijingCapitalInternationalAirport,
        ShanghaiPudongInternationalAirport,
        OuluAirport, HelsinkiAirport,
        ParisCharlesDGaulleAirport}
    public enum TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS}
    public enum DestinationAirport {
        NanjingLukouInternationalAirport,
        BeijingCapitalInternationalAirport,
        ShanghaiPudongInternationalAirport,
        OuluAirport, HelsinkiAirport,
        ParisCharlesDGaulleAirpor}
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    public double departingTicketPrice;
    public double returnTicketPrice;
    private double totalTicketPrice;
    public BookingClass bookClass;
    public TripType tripType;
    public TripDestination destination;
    public TripSource source;
    public SourceAirport sourceAirport;
    public DestinationAirport destinationAirport;
    public enum BookingClass {
        FIRST,BUSINESS,ECONOMY
    }
    public enum TripType{
        ONE_WAY,RETURN
    }

    String[] passengerFullName = new String[100];
    String[] passengerGender = new String[100];
    int[] passengerAge = new int[100];
    String[] ticketNumber = new String[100];
    int numbers;

    public FlightBooking(int numbers) {
        this.numbers=numbers;
    }

    public void setPassengerFullName(int i, String fullname){
        this.passengerFullName[i]=fullname;
    }
    public String getPassengerFullName(int i) {
        return passengerFullName[i];
    }

    public void setPassengerGender(int i, String gender){
        this.passengerGender[i]=gender;
    }
    public String getPassengerGender(int i) {
        return passengerGender[i];
    }

    public void setPassengerAge(int i, int age){
        this.passengerAge[i]=age;
    }
    public int getPassengerAge(int i) {
        return passengerAge[i];
    }


    public void reserveTickets(int numbers){
        String [] fullName = new String[numbers+1];
        String [] gender = new String[numbers+1];
        int [] age = new int[numbers+1];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers; ++i){
            System.out.println("Please enter the passenger's fullName ");
            fullName[i]=input.nextLine();
            setPassengerFullName(i, fullName[i]);
            getPassengerFullName(i);
            System.out.println("Please enter the passenger's gender ");
            gender[i]=input.nextLine();
            setPassengerGender(i, gender[i]);
            getPassengerGender(i);
            System.out.println("Please enter the passenger's age ");
            age[i]=input.nextInt();
            setPassengerAge(i, age[i]);
            getPassengerAge(i);
            input.nextLine();
        }

        System.out.println("Please pick your choice of class you would like to travel in\n1. First\n2. Business\n3. Economy");
        int a = input.nextInt();
        String choice1;
        switch(a){
            case 1:
                choice1 = "1";
                setBookingClass(choice1);
                break;
            case 2:
                choice1 = "2";
                setBookingClass(choice1);
                break;
            case 3:
                choice1 = "3";
                setBookingClass(choice1);
                break;
        }

        System.out.println("Please choose your tripType\n1. One way\n2. Return");
        int b = input.nextInt();
        String choice2;
        switch(b){
            case 1:
                choice2 = "1";
                setTripType(choice2);
                break;
            case 2:
                choice2 = "2";
                setTripType(choice2);
                break;
        }

        System.out.println("Please choose your sources\n1. Nanjing\n2. Beijing\n3. Oulu\n4. Helsinki");
        int c = input.nextInt();
        String choice3 = null;
        switch(c){
            case 1:
                choice3 = "1";
                setTripSource(choice3);
                break;
            case 2:
                choice3 = "2";
                setTripSource(choice3);
                break;
            case 3:
                choice3 = "3";
                setTripSource(choice3);
                break;
            case 4:
                choice3 = "4";
                setTripSource(choice3);
                break;
        }

        System.out.println("Please choose your destinations\n1. Nanjing\n2. Beijing\n3. Oulu\n4. Helsinki");
        int d = input.nextInt();
        String choice4;
        switch(d){
            case 1:
                choice4 = "1";
                setTripDestination(choice3,choice4);
                break;
            case 2:
                choice4 = "2";
                setTripDestination(choice3,choice4);
                break;
            case 3:
                choice4 = "3";
                setTripDestination(choice3,choice4);
                break;
            case 4:
                choice4 = "4";
                setTripDestination(choice3,choice4);
                break;
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please give the date of departure");
        String sdepart = input1.nextLine();
        LocalDate depart = LocalDate.parse(sdepart);
        setDepartureDate(depart);

        System.out.println("Please give the date of return");
        String sreturn = input1.nextLine();
        LocalDate returnDate = LocalDate.parse(sreturn);
        setReturnDate(returnDate);
        input.close();
        input1.close();
    }

    public void displayTripDetails(int numbers){
        int result = returnDate.compareTo(departureDate);
        System.out.println("Thank you for booking your flight with " + flightCompany + "\n" +
                "You reserved a total of " + numbers + " tickets." + "\n" );
        for(int i = 0; i < numbers; i++){
            System.out.println(
                    "\n"+"Here are the trip details for Passenger No." + (i+1) + "\n" + "\n"  +
                            "Passenger's Ticket Number: " + ticketNumber[i] + "\n" +
                            "Passenger's Full Name: " + passengerFullName[i] + "\n" +
                            "Passenger's Age: " + passengerAge[i] + "\n" +
                            "Passenger's Gender: " + passengerGender[i] + "\n" +
                            "From: " + source + "(" + sourceAirport + ")" + "\n" +
                            "To: " + destination + "(" + destinationAirport + ")" + "\n" +
                            "The flight departs on: " + departureDate + "\n" +
                            "And the return flight is on: " + returnDate );
            if((result == 1)||(result == 2)){
                System.out.println("(Changed from old returningDate to new returningDate)");
            }
        }
        System.out.println("Total ticket price in Euros: " + totalTicketPrice + "\n");
        if((result == 1)||(result == 2)){
            System.out.println("\nIMPORTANT NOTICE: As per our policy, " +
                    "the return date was changed because it was less than two days apart from your departure date.\n");
        }
    }


    public String getFlightCompany() {
        return flightCompany;
    }

    public void setFlightID(String flightID) {
        this.flightID=flightID;
    }
    public String getFlightID() {
        return flightID;
    }


    public String setTripSource(String choice3) {
        switch (choice3) {
            case "1":
                this.source = TripSource.NANJING;
                this.sourceAirport = SourceAirport.NanjingLukouInternationalAirport;
                break;
            case "2":
                this.source = TripSource.BEIJING;
                this.sourceAirport = SourceAirport.BeijingCapitalInternationalAirport;
                break;
            case "3":
                this.source = TripSource.OULU;
                this.sourceAirport = SourceAirport.OuluAirport;
                break;
            case "4":
                this.source = TripSource.HELSINKI;
                this.sourceAirport = SourceAirport.HelsinkiAirport;
                break;
            default:
        }
        return choice3;
    }
    public TripSource getTripSource() {
        return source;
    }
    public SourceAirport getsSourceAirport() {
        return sourceAirport;
    }


    public void setTripDestination(String choice3,String choice4) {
        if(choice4.equals(choice3)){
            System.out.println("Wrong! Please choose again.");
        }
        else switch (choice4){
            case"1":
                this.destination = TripDestination.NANJING;
                this.destinationAirport = DestinationAirport.NanjingLukouInternationalAirport;
                break;
            case "2":
                this.destination = TripDestination.BEIJING;
                this.destinationAirport = DestinationAirport.BeijingCapitalInternationalAirport;
                break;
            case "3":
                this.destination = TripDestination.OULU;
                this.destinationAirport = DestinationAirport.OuluAirport;
                break;
            case "4":
                this.destination = TripDestination.HELSINKI;
                this.destinationAirport = DestinationAirport.HelsinkiAirport;
                break;
            default:
        }
    }
    public TripDestination getTripDestination() {
        return destination;
    }
    public DestinationAirport getDestinationAirport() {
        return destinationAirport;
    }



    public void setSourceAirport(String choice3) {
        switch (choice3) {
            case "1":
                this.source = TripSource.NANJING;
                this.sourceAirport = SourceAirport.NanjingLukouInternationalAirport;
                break;
            case "2":
                this.source = TripSource.BEIJING;
                this.sourceAirport = SourceAirport.BeijingCapitalInternationalAirport;
                break;
            case "3":
                this.source = TripSource.OULU;
                this.sourceAirport = SourceAirport.OuluAirport;
                break;
            case "4":
                this.source = TripSource.HELSINKI;
                this.sourceAirport = SourceAirport.HelsinkiAirport;
                break;
            default:

        }
    }
    public void setDestinationAirport(String choice3,String choice4) {
        if(choice4.equals(choice3)){
            System.out.println("Wrong! Please choose again.");
        }
        else if(choice4.equals("1")){
            this.destination = TripDestination.NANJING;
            this.destinationAirport = DestinationAirport.NanjingLukouInternationalAirport;
        }
        else if(choice4.equals("2")){
            this.destination = TripDestination.BEIJING;
            this.destinationAirport = DestinationAirport.BeijingCapitalInternationalAirport;
        }
        else if(choice4.equals("3")){
            this.destination = TripDestination.OULU;
            this.destinationAirport = DestinationAirport.OuluAirport;
        }
        else if(choice4.equals("4")){
            this.destination = TripDestination.HELSINKI;
            this.destinationAirport = DestinationAirport.HelsinkiAirport;
        }
    }


    public void setDepartureDate(LocalDate departureDate){
        this.departureDate=departureDate;
    }
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate){
        int result = returnDate.compareTo(departureDate);
        if(result >= 2){
            this.returnDate=returnDate;
        }else if(result == 1){
            this.returnDate = returnDate.plusDays(1);
        }else if(result == 0){
            this.returnDate = returnDate.plusDays(2);
        }else System.out.println("Wrong!");
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setChildrenPassengers(int i){
        if(passengerAge[i] <= 18){
            childPassengers = childPassengers+1;
        }
    }
    public int getChildrenPassengers() {
        return childPassengers;
    }
    public void setAdultPassengers(int i){
        if(passengerAge[i] > 18){
            adultPassengers = adultPassengers+1;
        }
    }
    public int getAdultPassengers() {
        return adultPassengers;
    }
    public void setTotalPassengers(int numbers) {
        this.totalPassengers = numbers;
    }
    public int getTotalPassengers() {
        return totalPassengers;
    }


    private String type;
    private String booking_class;
    private String place;

    public void setTicketNumber(int i){
        if(tripType.equals(TripType.ONE_WAY)){
            type = "11";
        }
        if(tripType.equals(TripType.RETURN)){
            type = "22";
        }
        if(bookClass.equals(BookingClass.FIRST)){
            booking_class = "F";
        }
        if(bookClass.equals(BookingClass.BUSINESS)){
            booking_class = "B";
        }
        if(bookClass.equals(BookingClass.ECONOMY)){
            booking_class = "E";
        }
        if(((source == TripSource.NANJING) && (destination == TripDestination.BEIJING))||
                ((source == TripSource.BEIJING) && (destination == TripDestination.NANJING))||
                ((source == TripSource.OULU) && (destination == TripDestination.HELSINKI))||
                ((source == TripSource.HELSINKI) && (destination == TripDestination.OULU)))
        {
            place = "DOM";
        }else{
            place = "INT";
        }

        this.ticketNumber[i]=type+booking_class+"ILCN"+place;
    }

    public String getTicketNumber(int i) {
        return ticketNumber[i];
    }

    private static final double base_ticket_price = 300;
    private double Taxes;
    private double Service_fees;
    private double booking_class_charge;
    public void setDepartingTicketPrice(int child,int adults){
        if(bookClass.equals(BookingClass.FIRST)){
            booking_class_charge = 250;
        }
        if(bookClass.equals(BookingClass.BUSINESS)){
            booking_class_charge = 150;
        }
        if(bookClass.equals(BookingClass.ECONOMY)){
            booking_class_charge = 50;
        }
        if(((source == TripSource.NANJING) && (destination == TripDestination.BEIJING))||
                ((source == TripSource.BEIJING) && (destination == TripDestination.NANJING))||
                ((source == TripSource.OULU) && (destination == TripDestination.HELSINKI))||
                ((source == TripSource.HELSINKI) && (destination == TripDestination.OULU)))
        {
            Taxes=30;
            Service_fees=15;
        }else{
            Taxes=45;
            Service_fees=30;
        }
        this.departingTicketPrice = (child * (base_ticket_price + Taxes + Service_fees+booking_class_charge)) + (adults * (base_ticket_price + Taxes + Service_fees+booking_class_charge));

    }
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }
    public void setReturnTicketPrice(){
        this.returnTicketPrice = departingTicketPrice;
    }
    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }
    public void setTotalTicketPrice(){
        if(tripType.equals(TripType.ONE_WAY)){
            this.totalTicketPrice = departingTicketPrice;
        }
        if(tripType.equals(TripType.RETURN)){
            this.totalTicketPrice = departingTicketPrice + returnTicketPrice;
        }
    }
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setBookingClass(String choice1) {
        if(choice1.equals("1")){
            this.bookClass = BookingClass.FIRST;
        }
        if(choice1.equals("2")){
            this.bookClass = BookingClass.BUSINESS;
        }
        if(choice1.equals("3")){
            this.bookClass = BookingClass.ECONOMY;
        }
    }
    public BookingClass getBookingClass() {
        return bookClass;
    }

    public void setTripType(String choice2) {
        if(choice2.equals("1")){
            this.tripType = TripType.ONE_WAY;
        }
        if(choice2.equals("2")){
            this.tripType = TripType.RETURN;
        }
    }
    public TripType getTripType() {
        return tripType;
    }
}
