package lb6.Russian;

import lb6.AtomikSubmarine;
import lb6.AtomikSubmarineInterface;

public class RussianAtomikSubmarine extends AtomikSubmarine implements AtomikSubmarineInterface {
    public RussianAtomikSubmarine(int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine) {
        super(length, displacement, immersionDepth, speed, typeAtomikSubmarine);
    }
    @Override
    public String getDescription() {
        return "This russian atomik submarine. Its length is " + getLength() + " meters. Its displacement is "
                + getDisplacement() + " tons. It is capable of diving to depth of " + getImmersionDepth() + " meters." +
                " It is capable of developing a speed of up to " + getSpeed() + " nodes. Her type is " + getTypeAtomikSubmarine();
    }
}
