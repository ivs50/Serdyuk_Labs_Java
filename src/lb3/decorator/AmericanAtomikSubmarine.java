package lb3.decorator;

import lb3.AtomikSubmarine;

public class AmericanAtomikSubmarine implements Description {
    private final AtomikSubmarine atomikSubmarine;
    public AmericanAtomikSubmarine(AtomikSubmarine atomikSubmarine) {
        this.atomikSubmarine = atomikSubmarine; }

    @Override
    public String getDescription() {
        return this.atomikSubmarine.getDescription() + " This atomik submarine is in the Navy of USA."; }
}
