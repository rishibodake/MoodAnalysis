class MoodAnaliser {
    String message;

    public MoodAnaliser() {

    }

    public static void main(String[] args) {
        System.out.println("WelCome to mood Analiser");
    }
    //Default Constructor
    public MoodAnaliser(String s) {

    }
    //Function that return mood
    //Null pointer exception added
    public String analyseMood() throws MoodAnaliserException
    {
        try {
            if (message.length()==0)
                throw new MoodAnaliserException("Mood should not be empty",MoodAnaliserException.UserDefinedDataType.EMPTY_EXCEPTION);
            else if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException nullPointException)
        {
            throw new MoodAnaliserException("Mood should not be null",MoodAnaliserException.UserDefinedDataType.NULL_EXCEPTION);
        }
    }

    //Function with parameter
    public String analyseMood(String message)  {
        this.message=message;
        try {
            return analyseMood();
        } catch (MoodAnaliserException e) {
            e.printStackTrace();
        }
        return message;
    }


}
