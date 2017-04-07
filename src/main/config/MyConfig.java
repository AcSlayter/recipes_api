package main.config;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

/**
 * Created by aaron on 4/5/2017.
 */
public class MyConfig {
    private String fileName;
    private HashMap config;

    public MyConfig(){
        this(null);
    }

    public MyConfig( String file) {
        this.config =  new HashMap<String,Object>();
        this.fileName = file;
    }

    public Object getValue(String key) throws ValueNotAvailableException {
        Object keyValue = config.get(key);

        if (keyValue == null) {
            throw new ValueNotAvailableException(key, new Exception());
        }
        return (Object) keyValue;
    }

    public void addValue(String key, Object value){
        config.put(key,value);
    }

    public Boolean reloadXml(){
        return true;
    }

    public Boolean SaveXml(){
        return true;
    }
}
