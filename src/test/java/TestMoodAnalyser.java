import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
    MoodAnaliser object = new MoodAnaliser();

    @Test
    public void message_whenResponse_thenSad() throws MoodAnaliserException {
        String result=object.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_whenResponse_thenHappy() throws MoodAnaliserException {
        String result1=object.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",result1);
    }
    @Test
    public void givenNull_WhenResponse_thenHappy() throws MoodAnaliserException {
        String result1=object.analyseMood(null);
        Assert.assertEquals("HAPPY",result1);
    }

    @Test
    public void GivenEmptyMessage_ShouldReturn_EmptyMoodException()
    {
        try{
            MoodAnaliser object = new MoodAnaliser("");
            object.analyseMood();
        }
        catch (MoodAnaliserException e)
        {
            Assert.assertEquals(MoodAnaliserException.UserDefinedDataType.EMPTY_EXCEPTION,e.userDefinedObject);
        }
    }
}
