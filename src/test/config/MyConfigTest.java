package test.config;


import main.config.MyConfig;
import main.config.ValueNotAvailableException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by aaron on 4/5/2017.
 */
public class MyConfigTest {
    @Test
    public void getValueTestValid() throws Exception {
        String KEY = "MY_KEY";
        MyConfig my = new MyConfig();

        my.addValue(KEY,false);
        Assertions.assertFalse((boolean)my.getValue(KEY));
    }

    @Test
    public void getValueTestinvalid() {
        String KEY = "MY_KEY";
        MyConfig my = new MyConfig();

        my.addValue(KEY,false);
        try {
            my.getValue("some");

            Assertions.assertFalse(true);
        }catch (ValueNotAvailableException e){
            Assertions.assertTrue(true);
        }

    }

    @Test
    public void addValue() throws Exception {
        String KEY = "MY_KEY";
        MyConfig my = new MyConfig();

        my.addValue(KEY,false);
        Assertions.assertFalse((boolean)my.getValue(KEY));
    }

}