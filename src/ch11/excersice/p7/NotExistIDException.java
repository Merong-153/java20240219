package ch11.excersice.p7;

public class NotExistIDException extends Exception{
    public NotExistIDException(){}

    public NotExistIDException(String message) {
        super(message);
    }
}
