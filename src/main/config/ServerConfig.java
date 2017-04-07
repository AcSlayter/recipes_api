package main.config;

/**
 * Created by aaron on 4/6/2017.
 */
public class ServerConfig extends MyConfig {
    public ServerConfig(){
        super("ServerConfig");
    }

    public Integer getPort(){
        Integer integer;
        try {
           integer = (int) getValue("PORT");
        } catch (ValueNotAvailableException e) {
            integer = 8080;
            e.printStackTrace();
        }
        return integer;
    }
}
