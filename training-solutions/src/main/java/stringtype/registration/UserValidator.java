package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username){
        return username.length()!=0;
    }
    public boolean isValidPassword(String password1,String password2){
        return password1.length()>=8 &&
                password2.length()>=8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email){
        int atIndex=email.indexOf('@');
        return (atIndex+1)<email.indexOf('.',atIndex)&&
                email.charAt(0)!='@'&& email.charAt(email.length()-1)!='.';
    }


}
