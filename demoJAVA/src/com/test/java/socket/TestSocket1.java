package com.test.java.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSocket1 {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",8088);
		InetAddress address = s.getLocalAddress();
		int port = s.getLocalPort();
		System.out.println(address);
		System.out.println(port);
		System.out.println("--------------------");
		
		String hostName = address.getHostName();
		String hostName1 = address.getCanonicalHostName();
		String hAddress = address.getHostAddress();
		System.out.println(hostName);
		System.out.println(hostName1);
		System.out.println(hAddress);
	}
	
}
