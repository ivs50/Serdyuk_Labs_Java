package lb6;

public abstract class DieselElectricSubmarines extends Submarine {
    private String typeDieselElectricSubmarines;

    public DieselElectricSubmarines(int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine){
        super(length, displacement, immersionDepth, speed);
        this.typeDieselElectricSubmarines = typeAtomikSubmarine;
    }

    public String getTypeDieselElectricSubmarines() { return typeDieselElectricSubmarines; }
    public void setTypeDieselElectricSubmarines(String typeDieselElectricSubmarines) { this.typeDieselElectricSubmarines = typeDieselElectricSubmarines; }
}
