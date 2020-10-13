public class IllegalArgumentException extends Exception {

    public IllegalArgumentException(String functionName) {
        super(functionName + "(): illegal argument exception");
    }

    public IllegalArgumentException(String functionName, double x) {
        super(functionName + "(" + x + "): illegal argument exception");
    }
}
