package com.test.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPServer {

	public void start(){
		DatagramSocket socket;
		try {
			socket = new DatagramSocket(8088);
			byte[] buf = new byte[100];
			//构建接收包
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			//receive之后会发生阻塞。
			socket.receive(packet);
			String recStr = new String(packet.getData(),0,packet.getLength());
			System.out.println("客户端说："+recStr);
			
			//服务端往客户端发送数据。
			InetAddress ad = packet.getAddress();
			int port = packet.getPort();
			Scanner sr = new Scanner(System.in);
			String serverStr = sr.nextLine();
			byte[] bys = serverStr.getBytes();
			//构建服务器端的发送包
			DatagramPacket serverDP = new DatagramPacket(bys, bys.length, ad, port);
			socket.send(serverDP);
			
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UDPServer server = new UDPServer();
		server.start();
	}
	
}
