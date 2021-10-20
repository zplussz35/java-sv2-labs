package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product){
        this.product=product;
        stock=0;
    }
    public void store(int number){
        stock+=number;
    }
    public void dispatch(int number){
        stock-=number;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
