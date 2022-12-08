package lb5;

public class Rescueboat extends Speedboat implements SpeedboatInterface {
    private String typeRescueboat;

    public Rescueboat(int length, int displacement, int cruisingRange, int passengerCapacity, String typeRescueboat){
        super(length, displacement, cruisingRange, passengerCapacity);
        this.typeRescueboat = typeRescueboat;
    }

    public String getTypeRescueboat() { return  typeRescueboat; }
    public void  setTypeRescueboat(String typeRescueboat) { this.typeRescueboat = typeRescueboat; }

    public String getDescriptionSpeedboat() {
        return "This rescue boat. Its length is " + getLength() + " meters. Its displacement is " + getDisplacement() +
                " tons. Its cruising range is " + getCruisingRange() + " miles. It is capable of accommodating up to " +
                getPassengerCapacity() + " human. His type is " + getTypeRescueboat();
    }
}
