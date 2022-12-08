package lb3.decorator;

import lb3.DieselElectricSubmarines;

public class FrenchDieselElectricSubmarines implements Description{
    private final DieselElectricSubmarines dieselElectricSubmarines;
    public FrenchDieselElectricSubmarines(DieselElectricSubmarines dieselElectricSubmarines) {
        this.dieselElectricSubmarines = dieselElectricSubmarines; }

    @Override
    public String getDescription() {
        return this.dieselElectricSubmarines.getDescription() +
                " This diesel electric submarines is in the Navy of the French."; }
}
