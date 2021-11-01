package characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy szót: ");
        String text=sc.nextLine();
        System.out.println("Betűzd le ezt a szót: "+text);
        String nextChar;

        char[] textCharArray=text.toCharArray();
        char[] tippCharArray=new char[text.length()];
        for (int i = 0; i<text.length();i++){
            System.out.print((i+1)+". betű: ");
            nextChar=sc.nextLine();
            tippCharArray[i]=nextChar.charAt(0);
        }
        System.out.println("Tippjeid: ");
        for (char c : tippCharArray) {
            System.out.print(c+" ");
        }
        System.out.println("Az ebből kialakított szó: "+new String(tippCharArray));
        boolean success=true;
        for(int i=0;i<text.length();i++){
            if(tippCharArray[i]!=textCharArray[i]){
                System.out.println("Sajnos nem sikerült lebetűzni.");
                success=false;
            }
        }
        if(success){
            System.out.println("Sikeresen lebetüzted! Gratulálok! :)");
        }
    }
}
