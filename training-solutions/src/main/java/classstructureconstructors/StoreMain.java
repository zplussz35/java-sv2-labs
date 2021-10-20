package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store appleStore = new Store("apple");
        Store bananaStore = new Store("banana");
        appleStore.store(100);
        bananaStore.store(200);
        System.out.println(appleStore.getProduct()+"store: "+appleStore.getStock());
        System.out.println(bananaStore.getProduct()+"store: "+bananaStore.getStock());
        appleStore.dispatch(55);
        bananaStore.dispatch(140);
        System.out.println("After dispatch: ");
        System.out.println(appleStore.getProduct()+"store: "+appleStore.getStock());
        System.out.println(bananaStore.getProduct()+"store: "+bananaStore.getStock());



    }
}
