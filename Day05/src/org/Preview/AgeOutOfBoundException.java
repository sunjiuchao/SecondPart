package org.Preview;

public class AgeOutOfBoundException extends RuntimeException{
    public AgeOutOfBoundException() {

    }

    public AgeOutOfBoundException(String message) {
        super(message);
    }
}
