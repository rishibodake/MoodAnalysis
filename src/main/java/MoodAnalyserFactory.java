import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//Default constructor

public class MoodAnalyserFactory {
    public static Constructor getConstructor(String className, Class... parameter) throws MoodAnaliserException {
        try {
            Class<?> moodAnalyserClass = Class.forName(className);
            return  moodAnalyserClass.getConstructor(parameter);
        } catch (ClassNotFoundException e) {
            throw new MoodAnaliserException("Class not found",MoodAnaliserException.UserDefinedDataType.NO_SUCH_CLASS);
        } catch (NoSuchMethodException e) {
            throw new MoodAnaliserException("Method not found",MoodAnaliserException.UserDefinedDataType.NO_SUCH_METHOD);
        }

    }

    public static MoodAnaliser createMoodAnalyserObject(Constructor constructor,Object... objects) throws  MoodAnaliserException {
        try {
            return (MoodAnaliser) constructor.newInstance(objects);
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}