package com.test.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
	
	@SuppressWarnings("resource")
	public void start(){
		try {
			Scanner sc = new Scanner(System.in);
			DatagramSocket ds = new DatagramSocket();
			String sendStr = sc.nextLine();
			byte[] fa= sendStr.getBytes();
			int length = fa.length;
			InetAddress address = InetAddress.getByName("localhost");
			int port = 8088;
			//构建发送包
			DatagramPacket dp = new DatagramPacket(fa, length, address, port);
			ds.send(dp);
			
			byte[] ff = new byte[100];
			DatagramPacket clDP = new DatagramPacket(ff, ff.length);
			ds.receive(clDP);
			String serverStr = new String(clDP.getData(),0, clDP.getLength());
			System.out.println("服务端说："+serverStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UDPClient client = new UDPClient();
		client.start();
	}
	
}
