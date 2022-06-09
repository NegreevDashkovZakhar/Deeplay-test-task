package com.me.testtask.algorithm.exception;

/**
 * Exception thrown when the unknown field in map was encountered
 */
public class UnknownFieldNameException extends Exception {
    /**
     * Constructor initializing default message and setting cause of the exception
     *
     * @param cause cause of the exception
     */
    public UnknownFieldNameException(Throwable cause) {
        super("Encountered unknown field", cause);
    }

    /**
     * Constructor initializing default message
     */
    public UnknownFieldNameException() {
        super("Encountered unknown field");
    }
}
