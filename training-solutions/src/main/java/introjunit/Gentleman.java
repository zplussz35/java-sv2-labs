package introjunit;

public class Gentleman {
    public String sayHello(String name){
        if("".equals(name)) {
            return "Hello Anonymous!";
        }
        return String.format("Hello %s!",name);
    }
}
