package lb1;

public abstract class Submarine extends Ship{
    private int immersionDepth;
    private int speed;

    public Submarine (int length, int displacement, int immersionDepth, int speed){
        super(length, displacement);
        this.immersionDepth = immersionDepth;
        this.speed = speed;
    }

    public int getImmersionDepth() { return immersionDepth; }
    public void setImmersionDepth(int immersionDepth) { this.immersionDepth = immersionDepth; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) {this.speed = speed; }

    public abstract String getDescription();
}
