package lb6.Russian;

import lb6.DieselElectricSubmarines;
import lb6.DieselElectricSubmarineInterface;

public class RussianDieselElectricSubmarines extends DieselElectricSubmarines implements DieselElectricSubmarineInterface {
    public RussianDieselElectricSubmarines (int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine) {
        super(length, displacement, immersionDepth, speed, typeAtomikSubmarine);
    }
    @Override
    public String getDescription() {
        return "This russian diesel electric submarines. Its length is " + getLength() + " meters. Its displacement is "
                + getDisplacement() + " tons. It is capable of diving to depth of " + getImmersionDepth() + " meters." +
                " It is capable of developing a speed of up to " + getSpeed() + " nodes. Her type is " +
                getTypeDieselElectricSubmarines();
    }
}
