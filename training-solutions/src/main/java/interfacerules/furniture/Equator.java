package interfacerules.furniture;

public class Equator implements Name,Length{
    private static final String NAME ="Equator";
    private static final double LENGTH =40075.0;
    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
