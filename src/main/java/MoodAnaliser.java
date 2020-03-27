public class MoodAnaliser {
    String message;

    public static void main(String[] args) {
        System.out.println("WelCome to mood Analiser");
    }
    //Default Constructor
    public MoodAnaliser() {

    }
    //Function that return mood
    //Null pointer exception added
    public String analyseMood () {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e)
        {
            return "HAPPY";
        }
    }

    //Function with parameter
    public String analyseMood(String message)
    {
        this.message=message;
        return analyseMood();
    }


}
