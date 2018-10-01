package generic02;

import java.sql.Array;
import java.util.Arrays;

public class ArrayCreator<T> {
   public static <T> T[] create (int lenght,T item){
        Object[] objects = new Object[lenght];
        for (int i = 0; i < lenght; i++) {
            objects[i] = item;
        }
        return (T[]) objects;
    }
   public static <T> T[] create (Class<T> a, int lenght, T item){
       T[] objects = (T[]) java.lang.reflect.Array.newInstance(a,lenght);
        for (int i = 0; i < lenght; i++) {
            objects[i] = item;
        }
        return objects;
    }
}
