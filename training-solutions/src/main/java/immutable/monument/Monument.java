package immutable.monument;


public class Monument {
    private final String name;
    private final String title;
    private final String dateOfSerialized;
    private final String serialNumber;


    public Monument(String name, String title, String dateOfSerialized, String serialNumber) {
        isEmpty(name);
        isEmpty(title);
        isEmpty(dateOfSerialized);
        isEmpty(serialNumber);
        this.name = name;
        this.title = title;
        this.dateOfSerialized = dateOfSerialized;
        this.serialNumber = serialNumber;
    }

    public boolean isEmpty(String text){
        if(text==null||text.isEmpty()){
            throw new IllegalArgumentException("Dont correct attribute!");
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDateOfSerialized() {
        return dateOfSerialized;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
