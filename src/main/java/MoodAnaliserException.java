<<<<<<< HEAD
public class MoodAnaliserException extends Exception{


    enum UserDefinedDataType
    {
        NULL_EXCEPTION,
        EMPTY_EXCEPTION,
        NO_SUCH_CLASS,
        NO_SUCH_METHOD
=======
public class MoodAnaliserException extends Exception {
    enum UserDefinedDataType
    {
        NULL_EXCEPTION,
        EMPTY_EXCEPTION
>>>>>>> e1cbc2dfceb5217c15ec504c928a416165cad601
    };
    UserDefinedDataType userDefinedObject;
    public MoodAnaliserException(String message, UserDefinedDataType userDefinedObject)
    {
        super(message);
        this.userDefinedObject = userDefinedObject;
    }
<<<<<<< HEAD


=======
>>>>>>> e1cbc2dfceb5217c15ec504c928a416165cad601
}
