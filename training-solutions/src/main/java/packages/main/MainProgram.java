package packages.main;

import packages.greetings.Greeter;

public class MainProgram {
    public static void main(String[] args) {
        Greeter greet = new Greeter();
        greet.sayHello();
    }
}
