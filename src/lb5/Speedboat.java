package lb5;

public abstract class Speedboat extends Ship {
    private int cruisingRange;
    private int passengerCapacity;

    public Speedboat (int length, int displacement, int cruisingRange, int passengerCapacity){
        super(length, displacement);
        this.cruisingRange = cruisingRange;
        this.passengerCapacity = passengerCapacity;
    }

    public int getCruisingRange() { return cruisingRange; }
    public void setCruisingRange(int cruisingRange) { this.cruisingRange = cruisingRange; }

    public int getPassengerCapacity() { return  passengerCapacity; }
    public  void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }
}
