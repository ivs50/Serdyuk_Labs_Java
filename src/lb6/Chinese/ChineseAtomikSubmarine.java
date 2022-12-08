package lb6.Chinese;

import lb6.AtomikSubmarine;
import lb6.AtomikSubmarineInterface;

public class ChineseAtomikSubmarine extends AtomikSubmarine implements AtomikSubmarineInterface {
    public ChineseAtomikSubmarine(int length, int displacement, int immersionDepth, int speed, String typeAtomikSubmarine) {
        super(length, displacement, immersionDepth, speed, typeAtomikSubmarine);
    }
    @Override
    public String getDescription() {
        return "This chinese atomik submarine. Its length is " + getLength() + " meters. Its displacement is "
                + getDisplacement() + " tons. It is capable of diving to depth of " + getImmersionDepth() + " meters." +
                " It is capable of developing a speed of up to " + getSpeed() + " nodes. Her type is " + getTypeAtomikSubmarine();
    }
}
