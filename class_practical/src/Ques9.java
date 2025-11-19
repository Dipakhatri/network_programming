//Write a program to illustrate factory and getter method of network interface class.

import java.net.NetworkInterface;
import java.net.SocketException;

public class Ques9 {
    public static void main(String[]args){
        try{
            //Factory Method
            NetworkInterface netIf = NetworkInterface.getByName("wireless_0");

            if(netIf != null){
                //Getter methods
                System.out.println("Name:"+netIf.getName());
                System.out.println("Display Name:"+netIf.getDisplayName());
                System.out.println("Is Up:"+netIf.getDisplayName());
                System.out.println("Is Loopback:"+netIf.isLoopback());
                System.out.println("Supports Multicast:"+netIf.supportsMulticast());
            }else{
                System.out.println("Interface 'wireless_0'not found");
            }
        }catch(SocketException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
