package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        Integer b = 2;
        Integer c = a;
        Integer d = b;
        Integer e = new Integer(2);
        int f = new Integer(2);

        int g = new Integer(a);
        int h = new Integer(c);
        int i = Integer.parseInt("2");
        Integer j = Integer.parseInt("2");

        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);

        boolean k =true;
        Boolean l = true;
        boolean m = new Boolean(true);
        Boolean n = new Boolean(true);
        boolean o = Boolean.parseBoolean("trUe");
        Boolean p = Boolean.parseBoolean("trUe");
        boolean q = Boolean.parseBoolean("treU");
        Boolean r = Boolean.parseBoolean("treU");

        System.out.println(k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r);


    }
}
