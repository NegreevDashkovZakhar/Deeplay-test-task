package com.me.testtask;

/**
 * Application starting class
 */
public class Main {
    /**
     * Application starting method
     *
     * @param args given arguments to application(will not be used)
     */
    public static void main(String[] args) {
        try {
            System.out.println(Solution.getResult("STWSWTPPTPTTPWPP", "Human"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
