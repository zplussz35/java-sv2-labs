package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addLast("red");
        capsules.addLast("green");
        capsules.addLast("blue");
        capsules.addLast("black");

        System.out.println(capsules.getColors());

        capsules.addFirst("purple");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());


    }
}
