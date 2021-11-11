package introexceptionthrow.patient;

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
        SsnValidator.isValidSsn(ssn);
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
            Patient p = new Patient("Zoltán","000000000",1999);
            System.out.println("Név: "+p.getName());
            System.out.println("Megfelelő adatok!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Patient p = new Patient("László","002010000",1999);
            System.out.println("Név: "+p.getName());
            System.out.println("Megfelelő adatok!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End!");

    }

}
