import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//Default constructor
public class MoodAnalyserFactory {
    public static Constructor<?> getConstructor(String className) throws MoodAnaliserException {
        try {
            Class<?> moodAnalyzer = Class.forName(className);
            Class<?> parameter = null;
            return moodAnalyzer.getConstructor(parameter);
        } catch (ClassNotFoundException e) {
            throw new MoodAnaliserException("Class not found",MoodAnaliserException.UserDefinedDataType.NO_SUCH_CLASS);
        } catch (NoSuchMethodException e) {
            throw new MoodAnaliserException("Method not found",MoodAnaliserException.UserDefinedDataType.NO_SUCH_METHOD);
        }

    }
}