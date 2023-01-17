package com.mycompany.mavenproject1;
/**
 * import of the java.util class to be able to use the date type variable
 */
import java.util.Date;

/**
 * Represents the person class, along with its attributes and methods
 * @author Jaime Sanchez Mendieta
 */
public class Person {
    /**
     * Represents the attributes of the person class
     */
    private static String name;
    private static String lastName1;
    private static String lastName2;
    private static Date dateBirth;
    private static float height;

    /**
     * Creates an instance of the person class with no parameters
     */
    public Person() {
    }
    
    /**
     * Creates an instance of the person class with parameters
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

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
     * @return the lastName1
     */
    public static String getLastName1() {
        return lastName1;
    }

    /**
     * @param aLastName1 the lastName1 to set
     */
    public static void setLastName1(String aLastName1) {
        lastName1 = aLastName1;
    }

    /**
     * @return the lastName2
     */
    public static String getLastName2() {
        return lastName2;
    }

    /**
     * @param aLastName2 the lastName2 to set
     */
    public static void setLastName2(String aLastName2) {
        lastName2 = aLastName2;
    }

    /**
     * @return the dateBirth
     */
    public static Date getDateBirth() {
        return dateBirth;
    }

    /**
     * @param aDateBirth the dateBirth to set
     */
    public static void setDateBirth(Date aDateBirth) {
        dateBirth = aDateBirth;
    }

    /**
     * @return the height
     */
    public static float getHeight() {
        return height;
    }

    /**
     * @param aHeight the height to set
     */
    public static void setHeight(float aHeight) {
        height = aHeight;
    }
}
