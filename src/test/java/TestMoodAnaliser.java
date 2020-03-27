import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestMoodAnaliser {
    MoodAnaliser object = new MoodAnaliser("");

    @Test
    public void message_whenResponse_thenSad() {
        String result=object.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_whenResponse_thenHappy() {
        String result1=object.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",result1);
    }
    @Test
    public void givenNull_WhenResponse_thenHappy() {
        String result1=object.analyseMood(null);
        Assert.assertEquals("HAPPY",result1);
    }
    @Test
    public void GivenEmptyMessage_ShouldReturn_EmptyMoodException()
    {
        MoodAnaliser object = new MoodAnaliser("");
        object.analyseMood();
    }
    @Test
    public void givenObject_WhenEquals_ThenTrue() throws MoodAnaliserException {
        MoodAnaliser object = new MoodAnaliser("");
        Constructor constructor = MoodAnalyserFactory.getConstructor("MoodAnalyser");
        MoodAnaliser moodAnalyserObject = MoodAnalyserFactory.createMoodAnalyserObject(constructor);
        boolean result = object.equals(moodAnalyserObject);
        Assert.assertTrue("true",result);
    }
    @Test
    public void givenClass_WhenWrong_ThenReturnClassNotFound() {
        try {
            MoodAnalyserFactory.getConstructor("Moodanalyser");
        } catch (MoodAnaliserException e) {
            Assert.assertEquals(MoodAnaliserException.UserDefinedDataType.NO_SUCH_CLASS,e.userDefinedObject);
        }
    }

}
