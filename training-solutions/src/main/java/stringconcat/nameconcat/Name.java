package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title=Title.DEFAULT;

    public Name(String familyName, String middleName, String givenName, Title title){
        this.familyName=familyName;
        this.middleName=middleName;
        this.givenName=givenName;
        this.title=title;
    }
    public Name(String familyName, String middleName, String givenName){
        this.familyName=familyName;
        this.middleName=middleName;
        this.givenName=givenName;
    }

    public String concatNameWesternStyle(){
        return this.title.getValue()+this.givenName+" "+this.middleName+" "+this.familyName;
    }
    public String concatNameHungarianStyle(){
        return this.title.getValue().concat(this.familyName).concat(" ").concat(this.middleName).
                concat(" ").concat(this.givenName);
    }
}
