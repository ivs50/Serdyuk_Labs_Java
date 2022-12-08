package lb3.decorator;

import lb3.AtomikSubmarine;

public class RussianAtomikSubmarine implements Description {
    private final AtomikSubmarine atomikSubmarine;
    public RussianAtomikSubmarine(AtomikSubmarine atomikSubmarine) {
        this.atomikSubmarine = atomikSubmarine; }

    @Override
    public String getDescription() {
        return this.atomikSubmarine.getDescription() + " This atomik submarine is in the Navy of the Russian Federation."; }
}
