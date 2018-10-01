package aDemoRef;

import java.lang.annotation.Retention;
import java.lang.reflect.*;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IllegalAccessException,
            InstantiationException,
            NoSuchMethodException,
            InvocationTargetException {
        Class reflactionClass = Reflection.class;

//        Class superClass = reflactionClass.getSuperclass();
//
//        Class[] reflactionClassInterfaces = reflactionClass.getInterfaces();
//
//        Object ref = reflactionClass.newInstance();

        //Constructor cons = reflactionClass.getConstructor();
        // Constructor[] cons = reflactionClass.getConstructors();

        //Constructors!!!
//        Constructor[] cons = reflactionClass.getDeclaredConstructors();
//        Class<?>[] parameterTypes = null;
//        for (Constructor con : cons) {
//            if (con.getParameterCount() == 4) {
//                parameterTypes = con.getParameterTypes();
//                con.setAccessible(true);
//                Object onj = con.newInstance("Str1", "Str2", "Str3", 5);
//
//            }
//        }
//                Constructor constructor = reflactionClass.getConstructor(parameterTypes);
//
//        for (Constructor con : cons) {
//            System.out.println(con);
//        }
         // Field[] allField = reflactionClass.getDeclaredFields();
//        Field constant = allField[0];
//        constant.setAccessible(true);
//        Object ob = constant.get(constant.getType());
//        constant.set(ob,"Cow");
//        String deb = "";

        // Work
//        Reflection rf = (Reflection) reflactionClass.getConstructor().newInstance();
//        Field nameField = allField[1];
//        nameField.setAccessible(true);
//        Object nameObj = nameField.get(rf);
//        nameField.set(rf,"Cow");

        Reflection rf = (Reflection) reflactionClass.getConstructor().newInstance();
        Method[] allMethods = reflactionClass.getDeclaredMethods();
        Method firstMethodd = allMethods[1];
        firstMethodd.setAccessible(true);
        Object o = firstMethodd.invoke(rf);
      //  Object getName = firstMethodd.invoke(null);
        int modifier = firstMethodd.getModifiers();
        System.out.println(Modifier.toString(modifier));
        for (int i = 0; i < 1000; i++) {
            System.out.println(Modifier.toString(i));
        }






        String deb = "";
    }
}
