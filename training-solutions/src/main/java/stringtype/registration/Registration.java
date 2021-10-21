package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give username: ");
        String username=sc.nextLine();
        System.out.print("Give password1: ");
        String password1=sc.nextLine();
        System.out.print("Give password2: ");
        String password2=sc.nextLine();
        System.out.print("Give email: ");
        String email=sc.nextLine();

        UserValidator validator = new UserValidator();

        if(validator.isValidUsername(username)){
            System.out.println(username+" is valid!");
        }
        else{
            System.out.println(username+" is NOT valid!");
        }

        if(validator.isValidPassword(password1,password2)){
            System.out.println(password1+" is valid!");
        }
        else {
            System.out.println(password1 + " is NOT valid!");
        }

        if(validator.isValidEmail(email)){
            System.out.println(email+" is valid!");
        }
        else {
            System.out.println(email + " is NOT valid!");
        }
    }
}
