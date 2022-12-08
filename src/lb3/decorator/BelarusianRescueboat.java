package lb3.decorator;

import lb3.Rescueboat;

public class BelarusianRescueboat implements Description {
    private final Rescueboat rescueboat;
    public BelarusianRescueboat(Rescueboat rescueboat) {
        this.rescueboat = rescueboat; }

    @Override
    public String getDescription() {
        return this.rescueboat.getDescription() +
                " This rescue boat is part of the rescue service of Belarus."; }
}
