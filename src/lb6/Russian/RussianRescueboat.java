package lb6.Russian;

import lb6.Rescueboat;
import lb6.RescueboatInterface;

public class RussianRescueboat extends Rescueboat implements RescueboatInterface {
    public RussianRescueboat (int length, int displacement, int cruisingRange, int passengerCapacity, String typeRescueboat) {
        super(length, displacement, cruisingRange, passengerCapacity, typeRescueboat);
    }
    @Override
    public String getDescription() {
        return "This russian rescue boat. Its length is " + getLength() + " meters. Its displacement is " + getDisplacement() +
                " tons. Its cruising range is " + getCruisingRange() + " miles. It is capable of accommodating up to " +
                getPassengerCapacity() + " human. His type is " + getTypeRescueboat();
    }
}
