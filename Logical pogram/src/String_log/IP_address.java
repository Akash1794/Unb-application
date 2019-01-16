package String_log;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_address {

	public static void main(String[] args) throws Exception {
	InetAddress MyIP = InetAddress.getLocalHost();
	System.out.println(MyIP.getHostAddress());
	System.out.println(MyIP.getHostName());
	}

}
