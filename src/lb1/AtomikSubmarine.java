package lb1;

public class AtomikSubmarine extends Submarine{
    private String typeAtomikSubmarine;

    public AtomikSubmarine(int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine){
        super(length, displacement, immersionDepth, speed);
        this.typeAtomikSubmarine = typeAtomikSubmarine;
    }

    public String getTypeAtomikSubmarine() { return typeAtomikSubmarine; }
    public void setTypeAtomikSubmarine(String typeAtomikSubmarine) { this.typeAtomikSubmarine = typeAtomikSubmarine; }

    public String getDescription() {
        return "This atomik submarine. Its length is " + getLength() + " meters. Its displacement is "
                + getDisplacement() + " tons. It is capable of diving to depth of " + getImmersionDepth() + " meters." +
                " It is capable of developing a speed of up to " + getSpeed() + " nodes. Her type is " + getTypeAtomikSubmarine();
    }
}
