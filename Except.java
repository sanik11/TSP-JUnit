public class Except extends Exception {
    private double num;

    public double getNum() {
        return num;
    }

    public Except(String message, double num) {
        super(message);
        this.num = num;
    }
}
