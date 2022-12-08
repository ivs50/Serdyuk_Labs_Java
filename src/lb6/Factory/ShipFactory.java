package lb6.Factory;

import lb6.*;

public interface ShipFactory {
    AtomikSubmarineInterface getAtomikSubmarine();
    DieselElectricSubmarineInterface getDieselElectricSubmarines();
    RescueboatInterface getRescueboat();
}
