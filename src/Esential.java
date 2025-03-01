import java.net.UnknownHostException;
import java.util.Map;
import java.util.HashMap;
import java.net.InetAddress;

public class Esential {
    private String victimeIP;
    private String victimeName;
    private String hostIP;
    private Map<String,String> mapVictim = new HashMap<>();

    public Esential() {}

    public String getVictimeIP() {
        return victimeIP;
    }
    public void setVictimeIP(String victimeIP) {
        this.victimeIP = victimeIP;
    }
    public String getVictimeName() {
        return victimeName;
    }
    public void setVictimeName(String victimeName) {
        this.victimeName = victimeName;
    }
    public void addVictim(String key, String value) {
        mapVictim.put(key, value);
    }
    public void getMapVictim() {
        mapVictim.forEach((k,v)-> System.out.println("Victim name: "+k+" Victim IP: "+v));
    }
    public void setHostIP() {
        try {
            InetAddress temp = InetAddress.getLocalHost();
            hostIP = temp.getHostAddress();
            System.out.println("Host IP collected: "+hostIP);
        }catch (UnknownHostException e) {
            System.out.println("Host IP not found");
        }

    }
    public String getHostIP() {
        return hostIP;
    }
}
