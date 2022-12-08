package lb3;

public class DieselElectricSubmarines extends Submarine {
    private String typeDieselElectricSubmarines;

    public DieselElectricSubmarines() {
        super();
    }

    public DieselElectricSubmarines(int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine){
        super(length, displacement, immersionDepth, speed);
        this.typeDieselElectricSubmarines = typeAtomikSubmarine;
    }

    public String getTypeDieselElectricSubmarines() { return typeDieselElectricSubmarines; }
    public void setTypeDieselElectricSubmarines(String typeDieselElectricSubmarines) { this.typeDieselElectricSubmarines = typeDieselElectricSubmarines; }

    public String getDescription() {
        return "This diesel electric submarines. Its length is " + getLength() + " meters. Its displacement is "
                + getDisplacement() + " tons. It is capable of diving to depth of " + getImmersionDepth() + " meters." +
                " It is capable of developing a speed of up to " + getSpeed() + " nodes. Her type is " +
                getTypeDieselElectricSubmarines();
    }
}
