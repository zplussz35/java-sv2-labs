package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights= new ArrayList<>();
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }
    public StringBuilder getDeletedFlights(){
        List<Flight> deletedFlights= new ArrayList<>();
        for (Flight f : flights) {
            if(f.getStatus()==Status.DELETED){
                deletedFlights.add(f);
            }
        }
        StringBuilder sb = new StringBuilder("Törölt járatok:\n");
        for (Flight f : deletedFlights) {
            sb.append(f.getFlightNumber()+"\n");
        }
        return sb;
    }

    public static void main(String[] args) {
        Airport airport= new Airport();
        airport.addFlight(new Flight("B-2851",Status.ACTIVE));
        airport.addFlight(new Flight("C-7345",Status.DELETED));
        airport.addFlight(new Flight("D-8576",Status.ACTIVE));
        airport.addFlight(new Flight("A-5651",Status.ACTIVE));
        airport.addFlight(new Flight("G-2851",Status.DELETED));
        airport.addFlight(new Flight("F-5551",Status.DELETED));

        System.out.println(airport.getDeletedFlights());
    }
}
