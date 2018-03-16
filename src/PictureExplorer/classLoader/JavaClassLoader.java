/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PictureExplorer.classLoader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Luk
 */
public class JavaClassLoader extends ClassLoader {

    public String invokeClassMethod(String classBinName, String methodName,String arg1) {
       
        try {

            // Create a new JavaClassLoader 
            ClassLoader classLoader = this.getClass().getClassLoader();

            // Load the target class using its binary name
            Class loadedMyClass = classLoader.loadClass(classBinName);

            //System.out.println("Loaded class name: " + loadedMyClass.getName());

            // Create a new instance from the loaded class
            //Constructor constructor = loadedMyClass.getConstructor();
            Object myClassObject = loadedMyClass.newInstance();

            // Getting the target method from the loaded class and invoke it using its name
            Method method = myClassObject.getClass().getMethod(methodName, String.class);
           // System.out.println("Invoked method name: " + method.getName());
            String path = (String) method.invoke(myClassObject, arg1);
            return path;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.err.println(e);
        }
        return null;
    }
}
