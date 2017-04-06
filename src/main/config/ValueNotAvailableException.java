package main.config;

/**
 * Created by aaron on 4/5/2017.
 */
public class ValueNotAvailableException extends Exception {

    public ValueNotAvailableException(String key, Exception e) {
        super("Failed to find Key : value=".concat(key), e);
    }
}
