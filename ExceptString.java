public class ExceptString extends Exception {
    private String s;

    public String getS() {
        return s;
    }

    public ExceptString(String message, String s) {
        super(message);
        this.s = s;
    }
}
