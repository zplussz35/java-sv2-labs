package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if(args[i].equals("/list")){
                System.out.println("Listázás!");
            }
            else if(args[i].equals("/add")){
                System.out.println("Hozzáadás!");
            }
            else if(args[i].equals("/delete")){
                System.out.println("Törlés!");
            }
            else{
                System.out.println("Ismeretlen művelet!");
            }
        }
    }
}
