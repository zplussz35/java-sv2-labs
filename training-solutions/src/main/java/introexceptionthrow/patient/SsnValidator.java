package introexceptionthrow.patient;

public class SsnValidator {

    public static boolean isValidSsn(String ssn) {
        if(!tryParseInt(ssn)){
            throw new IllegalArgumentException("Nem számokat tartalmaz a TAJ szám!");
        }
        if(ssn.length()!=9){
            throw new IllegalArgumentException("Nem 9 számjegyből áll a TAJ  szám!");
        }
        int[] digits= new int[9];
        for (int i = 0; i < ssn.length(); i++) {
            int n=Integer.parseInt(String.valueOf(ssn.toCharArray()[i]));
            digits[i]=n;
        }
        int szum=0;
        for (int i = 0; i < digits.length-1; i++) {
            if(i%2==0){
                szum+=digits[i]*3;
            }
            else{
                szum+=digits[i]*7;
            }
        }
        if(szum%10==digits[8]){
            return true;
        }
        else{
            throw new IllegalArgumentException("Nem megfelelő a TAJ szám!");
        }

    }

    public static boolean tryParseInt(String number){
        try{
            int n= Integer.parseInt(number);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }


}
