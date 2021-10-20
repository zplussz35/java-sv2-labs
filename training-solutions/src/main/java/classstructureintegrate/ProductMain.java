package classstructureintegrate;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give product name: ");
        String productName=sc.nextLine();
        System.out.print("Give product price: ");
        int productPrice=sc.nextInt();
        sc.nextLine();
        Product product = new Product(productName,productPrice);
        System.out.println("name: "+product.getName()+", price: "+product.getPrice()+"$");
        System.out.print("How many do you decrease price?: ");
        product.decreasePrice(sc.nextInt());
        System.out.println("name: "+product.getName()+", price: "+product.getPrice()+"$");
        System.out.print("How many do you increase price?: ");
        product.increasePrice(sc.nextInt());
        System.out.println("name: "+product.getName()+", price: "+product.getPrice()+"$");
    }


}
