package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        //System.out.println(b);
        b=false;
        System.out.println(b);
        int i=2;
        System.out.println(i);

        //int i = 3;
        i=3;
        int j = 4;
        int k = i;
        System.out.println("i: "+i+" j: "+j+" k: "+k);
        String s = "Hello World!";
        System.out.println(s);
        String t=s;
        System.out.println(t);

        {
            int x=0;
            System.out.println(x);
            System.out.println("i: "+i+" j: "+j+" k: "+k);
        }

        //System.out.println(x);
    }
}
