package introexceptionthrow;

public class Validation {
    public void validateName(String name){
        if(name==null){
            throw new NullPointerException("A név mező értéke null!");
        }
        if("".equals(name)){
            throw new IllegalArgumentException("A név mező Üres String");
        }
    }
    public void validateAge(String ageString){
        if("".equals(ageString)){
            throw new IllegalArgumentException("Az életkor mező üresen lett hagyva!");
        }
        if(Integer.parseInt(ageString)<0||Integer.parseInt(ageString)>120){
            throw new IllegalArgumentException("Az életkor nem reális: "+Integer.parseInt(ageString));
        }
        if(tryParse(ageString)==-1){
            throw new NumberFormatException("Nem szám!");
        }
    }

    public int tryParse(String text){
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return -1;
        }
    }
}
