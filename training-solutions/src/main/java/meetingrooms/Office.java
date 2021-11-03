package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Office {
    private List<MeetingRoom> meetingRooms= new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        this.meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for (MeetingRoom m : meetingRooms) {
            System.out.println(m.getName());
        }
    }
    public void printNamesReverse(){
        for (int i = meetingRooms.size()-1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printEvenNames(){
        for (int i = 1; i < meetingRooms.size(); i+=2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas(){
        for (MeetingRoom m : meetingRooms) {
            System.out.println("Neve: "+m.getName());
            System.out.println("Hosszúsága: "+m.getLength()+"m");
            System.out.println("Szélessége: "+m.getWidth()+"m");
            System.out.println("Területe: "+m.getArea()+"m2");
        }
    }
    public void printMeetingRoomsWithName(String name){
        for (MeetingRoom m : meetingRooms) {
            if (m.getName().equals(name)){
                System.out.println("Szélessége: "+m.getWidth()+"m");
                System.out.println("Hosszúsága: "+m.getLength()+"m");
                System.out.println("Területe: "+m.getArea()+"m2");
            }
        }
    }
    public void printMeetingRoomsContains(String part){
        for (MeetingRoom m : meetingRooms) {
            if (m.getName().toLowerCase().contains(part.toLowerCase())){
                System.out.println("Szélessége: "+m.getWidth()+"m");
                System.out.println("Hosszúsága: "+m.getLength()+"m");
                System.out.println("Területe: "+m.getArea()+"m2");
            }
        }
    }

    public void printAreasLargerThan(int area){
        for (MeetingRoom m : meetingRooms) {
            if (m.getArea()>area){
                System.out.println("Név: "+m.getName());
                System.out.println("Szélessége: "+m.getWidth()+"m");
                System.out.println("Hosszúsága: "+m.getLength()+"m");
                System.out.println("Területe: "+m.getArea()+"m2");
            }
        }
    }



}
