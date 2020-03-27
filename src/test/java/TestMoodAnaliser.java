import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestMoodAnaliser {
    MoodAnaliser object = new MoodAnaliser();

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

}