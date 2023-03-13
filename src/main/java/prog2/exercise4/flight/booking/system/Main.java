package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){

        String sdepart="2023-03-04";
        LocalDate depart=LocalDate.parse(sdepart);
        String sreturn="2023-03-05";
        LocalDate returnDate=LocalDate.parse(sreturn);
        String FlightID="FOF"+Math.random()*9000+1000+"IN";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the total number of tickets you want to reserve : ");
        int numbers=input.nextInt();
        FlightBooking fb;
        fb = new FlightBooking(numbers);
        fb.reserveTickets(numbers);
        fb.getBookingClass();
        fb.getTripType();
        fb.getTripSource();
        fb.getTripDestination();

        for(int i=0; i<numbers; ++i){
            fb.setTicketNumber(i);
            fb.getTicketNumber();
        }

        fb.setTotalPassengers(numbers);
        fb.setFlightID("FOF"+"0345"+"IN");
        fb.setDepartingTicketPrice(0,3);
        fb.setReturnTicketPrice();
        fb.setTotalTicketPrice();
        fb.getDepartingTicketPrice();
        fb.getReturnTicketPrice();
        fb.getFlightCompany();
        fb.getDepartureDate();
        fb.displayTripDetails(numbers);

        input.close();
    }

}
