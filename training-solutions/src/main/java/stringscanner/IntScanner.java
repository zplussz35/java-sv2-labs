package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints){
        Scanner sc = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            int num= Integer.parseInt(sc.next());
            if(num>100){
                sb.append(num);
                sb.append(",");
            }
        }
        if(sb.length()!=0){
            sb.deleteCharAt(sb.length()-1);
        }
        else{
            sb.append("Nincs 100-nál nagyobb szám, vagy üres string!");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        IntScanner isc = new IntScanner();
        String text="43;100;150;250;99;101;230;112";
        System.out.println(isc.convertInts(text));
    }


}
