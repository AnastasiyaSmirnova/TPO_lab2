public class IllegalArgumentException extends Exception {

    public IllegalArgumentException(String functionName) {
        super(functionName + "(): illegal argument exception");

    }
}
