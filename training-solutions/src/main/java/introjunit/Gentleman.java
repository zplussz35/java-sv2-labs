package introjunit;

public class Gentleman {
    public String sayHello(String name){
        if(name==null) {
            return "Hello Anonymous!";
        }
        return String.format("Hello %s!",name);
    }
}
