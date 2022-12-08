package lb6;

public abstract class AtomikSubmarine extends Submarine {
    private String typeAtomikSubmarine;

    public AtomikSubmarine(int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine){
        super(length, displacement, immersionDepth, speed);
        this.typeAtomikSubmarine = typeAtomikSubmarine;
    }

    public String getTypeAtomikSubmarine() { return typeAtomikSubmarine; }
    public void setTypeAtomikSubmarine(String typeAtomikSubmarine) { this.typeAtomikSubmarine = typeAtomikSubmarine; }
}
