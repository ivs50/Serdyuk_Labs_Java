package lb6;

public abstract class Rescueboat extends Speedboat {
    private String typeRescueboat;

    public Rescueboat(int length, int displacement, int cruisingRange, int passengerCapacity, String typeRescueboat){
        super(length, displacement, cruisingRange, passengerCapacity);
        this.typeRescueboat = typeRescueboat;
    }

    public String getTypeRescueboat() { return  typeRescueboat; }
    public void  setTypeRescueboat(String typeRescueboat) { this.typeRescueboat = typeRescueboat; }
}
