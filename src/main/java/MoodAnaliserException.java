public class MoodAnaliserException extends Exception {
    enum UserDefinedDataType
    {
        NULL_EXCEPTION,
        EMPTY_EXCEPTION
    };
    UserDefinedDataType userDefinedObject;
    public MoodAnaliserException(String message, UserDefinedDataType userDefinedObject)
    {
        super(message);
        this.userDefinedObject = userDefinedObject;
    }
}
