package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    public void readOffice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nAdja meg a tárgyaló nevét: ");
        String name=sc.nextLine();
        System.out.print("Szélessége: ");
        int width=sc.nextInt();
        sc.nextLine();
        System.out.print("Hosszúsága: ");
        int length=sc.nextInt();
        sc.nextLine();
        MeetingRoom m = new MeetingRoom(name,length,width);
        office.addMeetingRoom(m);
    }
    public void printMenu(){
        String result= "1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés";
        System.out.println(result);
    }
    public void runMenu(){
        String name,part;
        int area;
        boolean loop = true;
        while(loop){
        printMenu();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nAdja emg a művelet számát: ");
        int control=sc.nextInt();
        sc.nextLine();


            switch (control){
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;

                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.print("\nAdja meg a tárgyaló nevét: ");
                    name = sc.nextLine();
                    office.printMeetingRoomsWithName(name);
                    break;
                case 7:
                    System.out.print("\nAdja meg a tárgyaló nevének egy részét: ");
                    part=sc.nextLine();
                    office.printMeetingRoomsContains(part);
                    break;
                case 8:
                    System.out.print("\nAdja meg a területet: ");
                    area=sc.nextInt();
                    sc.nextLine();
                    office.printAreasLargerThan(area);
                    break;
                case 9:
                    System.out.println("\nKilépés...");
                    loop=false;
                    break;
                default:
                    System.out.println("Hibás feladatszám! Próbálja újra!");
                    break;
            }
        }


    }

    public static void main(String[] args) {
        MeetingRoomController m = new MeetingRoomController();
        m.runMenu();
    }
}
