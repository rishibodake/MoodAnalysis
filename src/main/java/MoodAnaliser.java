public class MoodAnaliser {
    String message;

    public static void main(String[] args) {
        System.out.println("WelCome to mood Analiser");
    }
    //Default Constructor
    public MoodAnaliser() {

    }
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
