import java.util.HashSet;
import java.util.Set;
public class VirtualProductCodeManager {
    private static final  VirtualProductCodeManager instance = new VirtualProductCodeManager();
    private  volatile Set<String> codes = new HashSet<>();

    public static VirtualProductCodeManager getInstance(){
        return instance;
    }
public  synchronized boolean isCodeUsed(String code) {
    if (instance.codes.contains(code)) return true;
        instance.codes.add(code);
    return false;
    }
}
