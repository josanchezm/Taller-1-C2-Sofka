package com.mycompany.mavenproject1;

/**
 * import of the java.util class to be able to use the ArrayList type variable
 */
import java.util.ArrayList;

/**
 * Represents the fruit class, along with its attributes and methods
 * @author Jaime Sanchez Mendieta
 */
public class Fruit {
    /**
     * Represents the attributes of the fruit class
     */
    private static String name;
    private static float averageWeight;
    private static String color;
    private static ArrayList<String> colors = new ArrayList<String>(); 
    
    /**
     * Creates an instance of the fruit class with no parameters
     */
    public Fruit() {
    }
    
    /**
     * Creates an instance of the fruit class with parameters
     */
    public Fruit(String name, float averageWeight, ArrayList colors, String color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
        this.color = color;
    }
    
    //Setters and Getters
    /**
     * @return the name
     */
    public static String getName() {
        return name;
    }

    /**
     * @param aName the name to set
     */
    public static void setName(String aName) {
        name = aName;
    }

    /**
     * @return the averageWeight
     */
    public static float getAverageWeight() {
        return averageWeight;
    }

    /**
     * @param aAverageWeight the averageWeight to set
     */
    public static void setAverageWeight(float aAverageWeight) {
        averageWeight = aAverageWeight;
    }

    /**
     * @return the colors
     */
    public static ArrayList<String> getColors() {
        return colors;
    }

    /**
     * @param aColors the colors to set
     */
    public static void setColors(ArrayList<String> aColors) {
        colors = aColors;
    }

    /**
     * @return the color
     */
    public static String getColor() {
        return color;
    }

    /**
     * @param aColor the color to set
     */
    public static void setColor(String aColor) {
        color = aColor;
    }
}
