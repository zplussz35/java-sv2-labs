package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public String getAddress(){
        return address.addressToString();
    }

    public void correctDate(String name,String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String personToString(){
        return "name: "+this.name+"\nidentification card: "+this.identificationCard+
                "\n"+address.addressToString();
    }

    public void moveTo(Address adress){
        this.address=adress;
    }


}
