package MyWork;

import java.util.Scanner;

//Advanced Senior Citizen Ticket Booking – Java Program
class SeniorCitizenTicketBookingException extends Exception {
    public SeniorCitizenTicketBookingException(String message) {
        super(message);
    }
}
class Passenger {
    String name;
    int age;
    boolean isSeniorCitizen;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.isSeniorCitizen = age >= 60;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    } 
    public boolean isSeniorCitizen() {
        return isSeniorCitizen;
    }  

}   

class TicketBookingService1 {
    public void bookTicket(Passenger passenger) throws SeniorCitizenTicketBookingException {
        if (passenger.isSeniorCitizen()) {
            System.out.println("Ticket booked successfully for senior citizen: " + passenger.getName());
        } else {
            throw new SeniorCitizenTicketBookingException("Passenger " + passenger.getName() + " is not eligible for senior citizen ticket booking.");
        }

        System.out.println("Passenger Details: Name - " + passenger.getName() + ", Age - " + passenger.getAge() + ")");
    }
}
public class TicketBookingService  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketBookingService1 bookingService = new TicketBookingService1(); 

        System.out.println("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Passenger Age: ");
        int age = sc.nextInt();
        Passenger passenger = new Passenger(name, age);
        try {
            bookingService.bookTicket(passenger);
        } catch (SeniorCitizenTicketBookingException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }   
           

    }
}
