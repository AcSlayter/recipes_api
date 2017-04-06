package main.config;

import java.util.HashMap;

/**
 * Created by aaron on 4/5/2017.
 */
public class MyConfig {
    private HashMap config;

    public MyConfig() {
        this.config =  new HashMap<String,Boolean>();
    }

    public Boolean getValue(String key) throws ValueNotAvailableException {
        Object keyValue = config.get(key);

        if (keyValue == null) {
            throw new ValueNotAvailableException(key, new Exception());
        }
        return (Boolean) keyValue;
    }

    public void addValue(String key, boolean value){
        config.put(key,value);
    }
}
