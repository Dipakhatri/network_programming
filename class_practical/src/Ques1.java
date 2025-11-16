import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ques1 {
    public static void main(String[] args) {
        try{
            InetAddress InetAddress = java.net.InetAddress.getLocalHost();

            System.out.println("Hostname:"+InetAddress.getHostName());
            System.out.println("IP Address:"+InetAddress.getHostAddress());
        } catch(UnknownHostException e) {
            System.out.println("Unable to get.");
            e.printStackTrace();
        }
    }
}
