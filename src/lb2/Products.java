package lb2;

public class Products {
    private int i;
    public Products(int i) { this.i = i; }
    public int getI() { return i; }
    public void setI(int i) { this.i = i; }

    @Override
    public String toString() {
        return "Products (" + "i=" + i + ") ";
    }
}
