package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {
    public static void main(String[] args) {
        LocalDate start= LocalDate.of(2021,11,10);
        CyclingTour cyclingTour= new CyclingTour("Kékes túra",start);

        System.out.println("Túra leírása: "+cyclingTour.getDescription());
        System.out.println("Túra időpontja: "+cyclingTour.getStartTime());
        System.out.println("Túra résztvevők száma: "+cyclingTour.getNumberOfPeople());
        System.out.println("Túrán megtett km: "+cyclingTour.getKms());
        System.out.println();

        cyclingTour.registerPerson(100);
        cyclingTour.ride(20);



        System.out.println("Túra leírása: "+cyclingTour.getDescription());
        System.out.println("Túra időpontja: "+cyclingTour.getStartTime());
        System.out.println("Túra résztvevők száma: "+cyclingTour.getNumberOfPeople());
        System.out.println("Túrán megtett km: "+cyclingTour.getKms());

    }
}
