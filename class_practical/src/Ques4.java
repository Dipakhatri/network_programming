//Write a program to check IPv4 and IPv6 Address.
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ques4 {
    public static void main(String[]args){
        String ipAddress = "192.168.1.1";

        System.out.println("checking Address:");
        checkIPType(ipAddress);
    }
    public static void checkIPType(String ip) {
        try {
            InetAddress address = InetAddress.getByName(ip);
            if (address instanceof Inet4Address) {
                System.out.println(ip + "is a valid IPv4 address");
            } else if (address instanceof Inet6Address) {
                System.out.println(ip + "is a valid Ipv6 address");
            } else {
                System.out.println(ip + "is an unknown type of IP address");
            }
        } catch (UnknownHostException e) {
            System.out.println(ip + "is an invalid IP address");
        }
    }
}
