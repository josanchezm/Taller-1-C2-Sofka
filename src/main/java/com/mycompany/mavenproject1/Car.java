package com.mycompany.mavenproject1;

/**
 * Represents the Car class, along with its attributes and methods
 * @author Jaime Sanchez Mendieta
 */
public class Car {
    /**
     * Represents the attributes of the Car class
     */
    private static int wheels;
    public static double horsePower;
    protected static String model;
    private static boolean convertible;
    
    /**
     * Creates an instance of the Car class with no parameters
     */
    public Car() {
    }
    
    /**
     * Creates an instance of the Car class with parameters
     */
    public Car(int wheels, double horsePower, String model, boolean convertible) {
        this.wheels = wheels;
        this.horsePower = horsePower;
        this.model = model;
        this.convertible = convertible;
    }

    /**
     * @return the wheels
     */
    public static int getWheels() {
        return wheels;
    }

    /**
     * @param aWheels the wheels to set
     */
    public static void setWheels(int aWheels) {
        wheels = aWheels;
    }

    /**
     * @return the horsePower
     */
    public static double getHorsePower() {
        return horsePower;
    }

    /**
     * @param aHorsePower the horsePower to set
     */
    public static void setHorsePower(double aHorsePower) {
        horsePower = aHorsePower;
    }

    /**
     * @return the model
     */
    public static String getModel() {
        return model;
    }

    /**
     * @param aModel the model to set
     */
    public static void setModel(String aModel) {
        model = aModel;
    }

    /**
     * @return the convertible
     */
    public static boolean isConvertible() {
        return convertible;
    }

    /**
     * @param aConvertible the convertible to set
     */
    public static void setConvertible(boolean aConvertible) {
        convertible = aConvertible;
    }
}
