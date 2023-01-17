package com.mycompany.mavenproject1;

/**
 * Represents the Mammal class, along with its attributes and methods
 * @author Jaime Sanchez Mendieta
 */
public class Mammal {
    /**
     * Represents the attributes of the Mammal class
     */
    private static int paws;
    public static int weight;
    protected static String fur;
    private static boolean endangered;
    
    /**
     * Creates an instance of the Mammal class with no parameters
     */
    public Mammal() {
    }
    
    /**
     * Creates an instance of the Mammal class with parameters
     */
    public Mammal(int paws, int weight, String fur, boolean endangered) {
        this.paws = paws;
        this.weight = weight;
        this.fur = fur;
        this.endangered = endangered;
    }

    /**
     * @return the paws
     */
    public static int getPaws() {
        return paws;
    }

    /**
     * @param aPaws the paws to set
     */
    public static void setPaws(int aPaws) {
        paws = aPaws;
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
     * @return the fur
     */
    public static String getFur() {
        return fur;
    }

    /**
     * @param aFur the fur to set
     */
    public static void setFur(String aFur) {
        fur = aFur;
    }

    /**
     * @return the endangered
     */
    public static boolean isEndangered() {
        return endangered;
    }

    /**
     * @param aEndangered the endangered to set
     */
    public static void setEndangered(boolean aEndangered) {
        endangered = aEndangered;
    }  
}
