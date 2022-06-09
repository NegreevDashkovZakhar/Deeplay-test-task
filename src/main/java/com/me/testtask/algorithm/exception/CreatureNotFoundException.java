package com.me.testtask.algorithm.exception;

/**
 * Exception thrown when creature specified for solution class could not be found
 */
public class CreatureNotFoundException extends Exception {
    /**
     * Constructor initializing default message and setting cause of the exception
     *
     * @param cause cause of the exception
     */
    public CreatureNotFoundException(Throwable cause) {
        super("Specified creature could not be found", cause);
    }

    /**
     * Constructor initializing default message
     */
    public CreatureNotFoundException() {
        super("Specified creature could not be found");
    }
}
