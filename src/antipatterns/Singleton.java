package antipatterns;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    public int valor = 0;
    public Map<String, Object> serviceLocator = new HashMap<String, Object>();
    
    private Singleton() {
        valor = 0;
    }
    public static Singleton getInstane() {
        if (__singleton == null) {
            __singleton = new Singleton();
        }
        return __singleton;
    }
    private static Singleton __singleton = null;
}
