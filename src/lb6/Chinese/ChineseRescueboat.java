package lb6.Chinese;

import lb6.Rescueboat;
import lb6.RescueboatInterface;

public class ChineseRescueboat extends Rescueboat implements RescueboatInterface {
    public ChineseRescueboat (int length, int displacement, int cruisingRange, int passengerCapacity, String typeRescueboat) {
        super(length, displacement, cruisingRange, passengerCapacity, typeRescueboat);
    }
    @Override
    public String getDescription() {
        return "This chinese rescue boat. Its length is " + getLength() + " meters. Its displacement is " + getDisplacement() +
                " tons. Its cruising range is " + getCruisingRange() + " miles. It is capable of accommodating up to " +
                getPassengerCapacity() + " human. His type is " + getTypeRescueboat();
    }
}
