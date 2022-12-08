package lb5;

public abstract class Ship {
    private int length;
    private int displacement;

    public Ship (int length, int displacement) {
        this.length = length;
        this.displacement = displacement;
    }

    public int getLength() { return  length; }
    public void  setLength(int length) { this.length = length; }

    public int getDisplacement() { return displacement; }
    public void setDisplacement(int displacement) { this.displacement = displacement; }
}
