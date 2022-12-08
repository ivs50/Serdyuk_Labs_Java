package lb6;

import lb6.Factory.ShipFactory;
import lb6.Factory.ChineseShipFactory;
import lb6.Factory.RussianShipFactory;

public class Main {
    public static void main(String[] args) {
        ShipFactory shipFactory = getShipFactory("Russian");
        AtomikSubmarineInterface atomikSubmarine = shipFactory.getAtomikSubmarine();
        DieselElectricSubmarineInterface dieselElectricSubmarine = shipFactory.getDieselElectricSubmarines();
        RescueboatInterface rescueboat = shipFactory.getRescueboat();
        System.out.println(atomikSubmarine.getDescription());
        System.out.println(dieselElectricSubmarine.getDescription());
        System.out.println(rescueboat.getDescription());
    }

    public static ShipFactory getShipFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("Russian")) {
            return new RussianShipFactory();
        }
        else if (factoryName.equalsIgnoreCase("Chinese")) {
            return new ChineseShipFactory();
        }
        return null;
    }
}
