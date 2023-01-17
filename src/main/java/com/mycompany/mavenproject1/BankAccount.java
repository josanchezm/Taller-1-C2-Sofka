package com.mycompany.mavenproject1;

/**
 * Represents the Bank Account class, along with its attributes and methods
 * @author Jaime Sanchez Mendieta
 */
public class BankAccount {
    /**
     * Represents the attributes of the Bank Account class
     */
    private static int accountNumber;
    private static boolean activated;
    private static boolean actived; 
    
    /**
     * Creates an instance of the Bank Account class with no parameters
     */
    public BankAccount() {
    }
    
    /**
     * Creates an instance of the Bank Account class with parameters
     */
    public BankAccount(int accountNumber, boolean activated, boolean actived) {
        this.accountNumber = accountNumber;
        this.activated = activated; 
        this.actived = actived;
    }
    
    //Getters and Setters 
    
    /**
     * @return the accountNumber
     */
    public static int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param aAccountNumber the accountNumber to set
     */
    public static void setAccountNumber(int aAccountNumber) {
        accountNumber = aAccountNumber;
    }

    /**
     * @return the activated
     */
    public static boolean isActivated() {
        return activated;
    }

    /**
     * @param aActivated the activated to set
     */
    public static void setActivated(boolean aActivated) {
        activated = aActivated;
    }

    /**
     * @return the actived
     */
    public static boolean isActived() {
        return actived;
    }

    /**
     * @param aActived the actived to set
     */
    public static void setActived(boolean aActived) {
        actived = aActived;
    } 
}
