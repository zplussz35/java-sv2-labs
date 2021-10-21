package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix+name;
        message= message+444;

        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println("prefix: "+prefix+" name: "+name+" message: "+message+" b: "+b+" c: "+c);

        String empty1="";
        String empty2="";
        String empty3=empty1+empty2;
        System.out.println("length of 2 empty string: "+empty3.length());

        String Abc="Abcde";
        System.out.println("length: "+Abc.length());
        System.out.println(Abc.charAt(0)+", "+Abc.charAt(2));
        System.out.println(Abc.substring(0,3));
    }
}
