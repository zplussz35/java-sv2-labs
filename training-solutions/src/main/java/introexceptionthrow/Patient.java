package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
        if("".equals(name) || name==null){
            throw new IllegalArgumentException("A név mező üresen lett hagyva!");
        }
        if(yearOfBirth<1900){
            throw new IllegalArgumentException("A születési év kevesebb mint 1900");
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        try{
            Patient p = new Patient("Zoltán","634-423-634",1999);
            System.out.println("Név: "+p.getName()+" year of birth: "+ p.getYearOfBirth());
        }
        catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }
        try{
            Patient p1 = new Patient("Krisztina","635-623-538",1978);
            System.out.println("Név: "+p1.getName()+" year of birth: "+ p1.getYearOfBirth());
        }
        catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }
        try{
            Patient p2 = new Patient("","634-422-634",1966);
            System.out.println("Név: "+p2.getName()+" year of birth: "+ p2.getYearOfBirth());

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Patient p3 = new Patient("Tamás","639-427-674",1899);
            System.out.println("Név: "+p3.getName()+" year of birth: "+ p3.getYearOfBirth());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
