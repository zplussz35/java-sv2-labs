package stringbasic;

public class Student {
    private Person person;
    private String neptunCode;
    private String omId;
    private String cardNum;


    public Student(Person person, String neptunCode, String omId) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.omId = omId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getOmId() {
        return omId;
    }

    public void setOmId(String omId) {
        this.omId = omId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public String toString() {
        return "name: " + person +
                " neptunCode: " + neptunCode;
    }
}
