public class MoodAnaliser {
    String message;
    //Function that return mood
    public String analyseMood () {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    //Function with parameter
    public String analyseMood(String message)
    {
        this.message=message;
        return analyseMood();
    }

}
