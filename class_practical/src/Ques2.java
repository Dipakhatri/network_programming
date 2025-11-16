//2.Write a program to implement InetAddress getter methods.

import java.net.InetAddress;

public class Ques2 {
    public static void main(String[] args){
        try{
            //Get local host address
            InetAddress inet= InetAddress.getLocalHost();

            //Display details using getter methods
            System.out.println("Host Name:" + inet.getHostName());
            System.out.println("HostAddress:" +inet.getHostAddress());
            System.out.println("Canonical Host:" +inet.getCanonicalHostName());
            System.out.println("Is Loopback:"+ inet.isLoopbackAddress());
            System.out.println("Is Reachable:"+inet.isReachable(2000));
            System.out.println("Is Multicast:"+inet.isMulticastAddress());
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
