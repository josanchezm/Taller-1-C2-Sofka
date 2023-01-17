package com.mycompany.mavenproject1;

/**
 * Represents the Rocket class, along with its attributes and methods
 * @author Jaime Sanchez Mendieta
 */
public class Rocket {
    /**
     * Represents the attributes of the Rocket class
     */
    private static int speed;
    protected static int weight;
    public static String model;
    private static boolean inOrbit;
    
    /**
     * Creates an instance of the Rocket class with no parameters
     */
    public Rocket() {
    }
    
    /**
     * Creates an instance of the Rocket class with parameters
     */
    public Rocket(int speed, int weight, String model, boolean inOrbit) {
        this.speed = speed;
        this.weight = weight;
        this.model = model;
        this.inOrbit = inOrbit;
    }

    /**
     * @return the speed
     */
    public static int getSpeed() {
        return speed;
    }

    /**
     * @param aSpeed the speed to set
     */
    public static void setSpeed(int aSpeed) {
        speed = aSpeed;
    }

    /**
     * @return the weight
     */
    public static int getWeight() {
        return weight;
    }

    /**
     * @param aWeight the weight to set
     */
    public static void setWeight(int aWeight) {
        weight = aWeight;
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
     * @return the inOrbit
     */
    public static boolean isInOrbit() {
        return inOrbit;
    }

    /**
     * @param aInOrbit the inOrbit to set
     */
    public static void setInOrbit(boolean aInOrbit) {
        inOrbit = aInOrbit;
    }
}
