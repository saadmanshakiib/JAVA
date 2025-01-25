import java.net.*;
import java.io.*;
public class networking {

    public static void main(String[] args){
        try{
            if(args.length>0){
                String host = args[0];
                InetAddress[] addresses = InetAddress.getAllByName(host);
                System.out.println("\nRemote Host : ");
                for(int i=0;i<addresses.length;i++){
                    System.out.println(addresses[i]);
                }
            }
            else{
                InetAddress localhostAddress = InetAddress.getLocalHost();
                System.out.println("Local Host : "+localhostAddress);
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
