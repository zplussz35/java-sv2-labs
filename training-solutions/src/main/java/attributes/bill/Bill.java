package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem= new BillItem("apple",250,10,27);
        System.out.println("Product: "+billItem.getProduct());
        System.out.println("Price: "+billItem.getPrice());
        System.out.println("Quantity: "+billItem.getQuantity());
        System.out.println("VatPercent: "+billItem.getVatPercent());

        System.out.println("Sum: "+billItem.calculateTotalPrice(billItem.getPrice(), billItem.getQuantity(),
                billItem.getVatPercent()));

    }
}
