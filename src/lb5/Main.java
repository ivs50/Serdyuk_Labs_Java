package lb5;

import lb5.factory.SubmarineFactory;
import lb5.factory.SpeedboatFactory;

public class Main {
    public static void main(String[] args) {
        SubmarineFactory submarineFactory = new SubmarineFactory();
        SubmarineInterface submarine1 = submarineFactory.getSubmarine("AtomikSubmarine");
        SubmarineInterface submarine2 = submarineFactory.getSubmarine("DieselElectricSubmarines");
        SpeedboatFactory speedboatFactory = new SpeedboatFactory();
        SpeedboatInterface speedboat1 = speedboatFactory.getSpeedboat("Rescueboat");
        System.out.println(submarine1.getDescriptionSubmarine());
        System.out.println(submarine2.getDescriptionSubmarine());
        System.out.println(speedboat1.getDescriptionSpeedboat());
    }
}
